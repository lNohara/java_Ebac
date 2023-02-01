package br.com.lnohara.mod32.dao;

import br.com.lnohara.mod32.domain.Curso;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CursoDao implements ICursoDao {

    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("ExemploJPA");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void closeConnection(){
        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public Curso cadastrar(Curso curso) {
        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();

        closeConnection();

        return curso;
    }

    @Override
    public Curso getByCodigo(String codigo) {
        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Curso> cr = cb.createQuery(Curso.class);
        Root<Curso> root = cr.from(Curso.class);
        cr.select(root).where(cb.equal(root.get("codigo"), codigo));

        Query query = entityManager.createQuery(cr);
        query.setMaxResults(1);
        List<Curso> resultList = query.getResultList();

        Curso curso = resultList.get(0);
        return curso;
    }


    @Override
    public Curso consultarPorCodigo(String codigo) {
        try {
            return getByCodigo(codigo);
        } finally {
            closeConnection();
        }
    }

    @Override
    public List<Curso> consultarTodos() {
        try {
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<Curso> cq = cb.createQuery(Curso.class);
            Root<Curso> rootEntry = cq.from(Curso.class);
            CriteriaQuery<Curso> all = cq.select(rootEntry);
            TypedQuery<Curso> allQuery = entityManager.createQuery(all);
            return allQuery.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Curso merge(String codigo, String nome, String descricao) {

        try {
            Curso curso = getByCodigo(codigo);
            curso.setNome(nome);
            curso.setDescricao(descricao);

            entityManager.merge(curso);
            entityManager.getTransaction().commit();
            return curso;
        } finally {
            entityManager.close();
        }

    }

    public void deletar(String codigo) {
        try {
            Curso curso = getByCodigo(codigo);
            entityManager.remove(curso);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

}

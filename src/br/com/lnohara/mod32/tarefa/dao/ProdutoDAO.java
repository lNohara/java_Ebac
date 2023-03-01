package br.com.lnohara.mod32.tarefa.dao;

import br.com.lnohara.mod32.domain.Curso;
import br.com.lnohara.mod32.tarefa.domain.Produto;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ProdutoDAO implements IProdutoDao {

    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("ExemploJPA");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void closeConnection() {
        entityManager.close();
        entityManagerFactory.close();
    }

    /**
     *
     * @param produto e suas propriedades
     * @return produto cadastrado
     */
    @Override
    public Produto cadastrar(Produto produto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(produto);
            entityManager.getTransaction().commit();
        } finally {
            closeConnection();
        }
        return produto;
    }


    /**
     *
     * @param codigo de barras do produto
     * @return produto correspondente ao argumento
     * Deve ser utilizado apenas dentro de outro método
     * que garanta o fechamento da conexão
     */
    @Override
    public Produto getByCodigoDeBarras(Long codigo) {
        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Produto> cr = cb.createQuery(Produto.class);
        Root<Produto> root = cr.from(Produto.class);
        cr.select(root).where(cb.equal(root.get("codigoDeBarras"), codigo));

        Query query = entityManager.createQuery(cr);
        query.setMaxResults(1);
        List<Produto> resultList = query.getResultList();

        Produto produto = resultList.get(0);
        return produto;
    }

    /**
     *
     * @param codigoDeBarras
     * @return produto correspondente ao argumento
     */
    @Override
    public Produto consultarPorCodigoDeBarras(Long codigoDeBarras) {
        try {
            return getByCodigoDeBarras(codigoDeBarras);
        } finally {
            closeConnection();
        }
    }

    /**
     *
     * @return lista de todos produtos cadastrados
     * Dedve ser utilizado apenas dentro de outro método
     * que garanta o fechamento da conexão
     */
    @Override
    public List<Produto> listarTodos() {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Produto> cq = cb.createQuery(Produto.class);
        Root<Produto> rootEntry = cq.from(Produto.class);
        CriteriaQuery<Produto> all = cq.select(rootEntry);
        TypedQuery<Produto> allQuery = entityManager.createQuery(all);
        List<Produto> list = allQuery.getResultList();

        entityManager.close();
        entityManagerFactory.close();

        return list;
    }

    /**
     *
     * @return lista de todos produtos cadastrados
     */
    @Override
    public List<Produto> consultarTodos() {
        try {
            return listarTodos();
        } finally {
            entityManager.close();
        }
    }

    /**
     *
     * @param codigoDeBarras
     * @param nome
     * @param descricao
     * @param dataFabricacao
     * @param dataVencimento
     * @param valor
     * @return produto com as novas propriedades passadas no argumento
     */
    @Override
    public Produto merge(Long codigoDeBarras, String nome, String descricao,
                         String dataFabricacao, String dataVencimento, Double valor) {
        try {
            Produto produto = getByCodigoDeBarras(codigoDeBarras);

            produto.setNome(nome);
            produto.setDescricao(descricao);
            produto.setDataFabricacao(dataFabricacao);
            produto.setDataVencimento(dataVencimento);
            produto.setValor(valor);

            entityManager.merge(produto);
            entityManager.getTransaction().commit();
            return produto;
        } finally {
            entityManager.close();
        }
    }

    /**
     * Deleta um produto
     * @param codigoDeBarras
     */
    @Override
    public void deletarPorCodigoDeBarras(Long codigoDeBarras) {
        try {
            Produto produto = getByCodigoDeBarras(codigoDeBarras);
            entityManager.remove(produto);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }


    /**
     * Deleta todos os produtos cadastrados
     * @param produto
     */
    @Override
    public void excluir(Produto produto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        produto = entityManager.merge(produto);
        entityManager.remove(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}



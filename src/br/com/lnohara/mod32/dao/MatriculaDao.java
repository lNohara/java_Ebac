package br.com.lnohara.mod32.dao;

import br.com.lnohara.mod32.domain.Matricula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MatriculaDao implements IMatriculaDao{
    @Override
    public Matricula cadastrar(Matricula mat) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(mat);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return mat;
    }
}

package org.zutjmx.webapp.ear.ejb;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@ApplicationScoped
public class ProducerResources {

    @PersistenceUnit(name = "ejemploJpa")
    private EntityManagerFactory entityManagerFactory;

    @Produces
    @RequestScoped
    private EntityManager beanEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public void close(@Disposes EntityManager entityManager) {
        if(entityManager.isOpen()) {
            entityManager.close();
            System.out.println(":: Cerrando conexión del EntityManager ::");
        }
    }

}

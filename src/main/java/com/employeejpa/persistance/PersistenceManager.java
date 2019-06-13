package com.employeejpa.persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

    public static PersistenceManager instance;

    private EntityManagerFactory entityManagerFactory;

    private PersistenceManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("employeeJPA");
    }

    public static synchronized PersistenceManager getInstance() {
        if (null == instance) {
            instance = new PersistenceManager();
        }

        return instance;
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}

package com.employeejpa;

import com.employeejpa.entities.Address;
import com.employeejpa.persistance.PersistenceManager;

import javax.persistence.EntityManager;

public class EmployeeJPAApp {

    public static void main (String args[]) {


        EntityManager entityManager = PersistenceManager.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        Address address = new Address();
        address.setCity("Missouri City");
        address.setCountry("United States");
        address.setState("Texas");
        address.setStreet("4111 Shadow Briar Lane");
        address.setZipCode("77459");
        entityManager.persist(address);
        entityManager.getTransaction().commit();
    }
}

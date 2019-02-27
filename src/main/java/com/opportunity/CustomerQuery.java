package com.opportunity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CustomerQuery {

    public static void main(String[] args) {
        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder().configure().build();


        SessionFactory sessionFactory = new MetadataSources(registry).addAnnotatedClass(CustomerHPN.class)
                .buildMetadata().buildSessionFactory();

        CustomerHPN customer = new CustomerHPN();


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        customer = session.get(CustomerHPN.class, 1);
        System.out.println(customer.getFirstName());

        Criteria criteria = session.createCriteria(CustomerHPN.class);

        transaction.commit();
        session.close();
    }
}

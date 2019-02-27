package com.opportunity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HibernateExample {
    public static void main(String[] args) {
        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder().configure().build();


        SessionFactory sessionFactory = new MetadataSources( registry ) .addAnnotatedClass(Employee.class)
                                .addAnnotatedClass(Pet.class)
                                 .buildMetadata().buildSessionFactory();

       Employee employee = new Employee();
       Pet pet = new Pet();
        //employee.setEmpId((6));
       /* employee.setFirstName("Igor");
        employee.setLastName("Nikolaev");
        employee.setSalary(300000);
        employee.setStartDate(new Date());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Bobik", "Dog", employee));

        employee.setPets(pets);*/

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Employee.class);
        List list = criteria.list();
  

        //session.save(employee);

       /* employee = session.get(Employee.class, 304);
        pet = session.get(Pet.class, 1);
        System.out.println(pet.getName()); */

      //  session.delete(employee);
       // System.out.println(employee.getPets() +" "+ employee.getLastName());
        transaction.commit();
        session.close();

    }
}

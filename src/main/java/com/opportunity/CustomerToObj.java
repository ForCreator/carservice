package com.opportunity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerToObj {

    public static Customer customerObj(ResultSet result){
        Customer customer = new Customer();
        try {
            customer.customerId = result.getInt(1);
            customer.firstName = result.getString(2);
            customer.lastName = result.getString(3);
            customer.age = result.getInt(5);
            customer.birthDate= result.getDate(4);
            customer.gender = result.getString(6);
            customer.phone = result.getString(7);
            customer.email = result.getString(8);
            customer.city = result.getString(9);
            customer.street = result.getString(10);
            customer.building = result.getString(11);


        }   catch (SQLException e){
            System.out.println("object error");
        }
        return customer;
    }
}

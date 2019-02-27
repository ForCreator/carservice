package com.opportunity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = ConnectJDBC.getConnect()){
            Statement statement = connection.createStatement();

            //String query = "select * from customer";
            String query = CRUD.getCustomer(2);
            ResultSet resultSet = statement.executeQuery(query);
            Customer customer = new Customer();

            while (resultSet.next()) {
                customer = CustomerToObj.customerObj(resultSet);
                System.out.println(customer.firstName +" " + customer.lastName);
            }

        } catch (SQLException e){
            System.out.println("connection error");
        }
    }
}

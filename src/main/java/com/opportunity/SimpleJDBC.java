package com.opportunity;

import java.sql.*;

public class SimpleJDBC {
    private final static String URL = "jdbc:mysql://localhost:3306/car_service";
    private static final String USER = "root";
    private static final String PASSWORD = "Sloter417";
    public static void main(String[] args) {
//соединение с базой
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
//отправка запросов
            Statement statement = connection.createStatement();

            String query = "select * from customer";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                //String salary = resultSet.getString("salary");
                System.out.println(firstName + " " + lastName);
            }

        } catch (SQLException e){

        }
    }
}

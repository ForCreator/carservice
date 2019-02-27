package com.opportunity;

import java.sql.Statement;

public class CRUD {
    public static String getCustomer(int id){
        String query = "select * from customer where customer_id = " + id;
        return query;
    }
}

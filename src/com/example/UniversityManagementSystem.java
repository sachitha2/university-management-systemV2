package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
public class UniversityManagementSystem {
    public static void main(String[] args){
        DB obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        System.out.println(connection);
    }


}

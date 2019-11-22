package com.example;

import java.sql.*;

public class DB {

    public void getCourses(){
        DB obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        PreparedStatement ps=null;
        String query="SELECT * FROM courses;";
        try {
            ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("id")+" - "+rs.getString("course_code"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public int addStudent(Std std){
        DB obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        PreparedStatement ps=null;
        String query="INSERT INTO student (id, name, username, password, age) VALUES (NULL, '"+std.getName()+"', '"+std.getUsername()+"', '"+std.getUsername()+"', '"+std.getAge()+"');";
        try {
            ps=connection.prepareStatement(query);
            ps.execute();
//            while(rs.next()){
//                System.out.println(rs.getString("id")+" - "+rs.getString("course_code"));
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



        return std.getAge();
    }

    public Connection get_connection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS","root","");
        }catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}

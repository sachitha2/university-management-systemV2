package com.example;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
public class UniversityManagementSystem {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        DB obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        System.out.println(connection);


        UniversityManagementSystem ums = new UniversityManagementSystem();
        ums.menu();
    }

    public void menu(){
        System.out.println("Select,  [1] SignUp , [2] SignIn, [3] Add course");
        int menuSelector = input.nextInt();
//        Student studentObject = new Student();
//        Lecturer lecturerObject = new Lecturer();
//        Courses courseObject = new Courses();
        if(menuSelector == 1){
            System.out.println("Please select your registration role [1] Lecturer, [2] Student.");
            int roleSelector = input.nextInt();
            if(roleSelector == 1){
//                lecturerObject.registerLecturer();
            }else{
//                studentObject.registerStudent();
            }
        }else if(menuSelector == 2){
            System.out.println("Please select your registration role [1] Lecturer, [2] Student.");
            int roleSelector = input.nextInt();
            if(roleSelector == 1){
//                lecturerObject.loginLecturer();
            }else{
//                studentObject.loginStudent();
            }
        }else if(menuSelector==3){
//            courseObject.registerCourses();
        }else{
            System.out.println("Input error....");
        }
    }
}

package com.example;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
public class UniversityManagementSystem {
    public static DB obj_DB_Connection;
    String sName;
    String uName;
    String pass;
    int age;


    public static void main(String[] args){
        obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        System.out.println(connection);



        UniversityManagementSystem ums = new UniversityManagementSystem();
        ums.menu();


    }

    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select,  [1] SignUp , [2] SignIn, [3] Add course");
        int menuSelector = input.nextInt();

//        Lecturer lecturerObject = new Lecturer();
//        Courses courseObject = new Courses();
        if(menuSelector == 1){
            System.out.println("Please select your registration role [1] Lecturer, [2] Student.");
            int roleSelector = input.nextInt();
            //Lecture
            if(roleSelector == 1){
//                lecturerObject.registerLecturer();
            }
            //Student
            else{



                System.out.print("Name: \n");
                Scanner scannerStudent = new Scanner(System. in);
                sName = scannerStudent. nextLine();


                System.out.print("Username: \n");
                uName = scannerStudent. nextLine();

                System.out.print("Password\n");
                pass = scannerStudent. nextLine();

                System.out.print("Age :\n");

                age = input.nextInt();
                Std student = new Std(sName,uName,pass,age);
                System.out.println(obj_DB_Connection.addStudent(student));
//                if(obj_DB_Connection.addStudent(student) == 1){
//
//                }
//                System.out.println(input.nextInt());

//                obj_DB_Connection.getCourses();
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

package com.example;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
public class UniversityManagementSystem {
    public static DB obj_DB_Connection;
    String name;
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

        if(menuSelector == 1){
            System.out.println("Please select your registration role [1] Lecturer, [2] Student.");
            int roleSelector = input.nextInt();
            //Lecture
            if(roleSelector == 1){
                System.out.print("Name: \n");
                Scanner scannerStudent = new Scanner(System. in);
                name = scannerStudent. nextLine();


                System.out.print("Username: \n");
                uName = scannerStudent. nextLine();

                System.out.print("Password\n");
                pass = scannerStudent. nextLine();

                Lecturer lecturer = new Lecturer(name,uName,pass);

                System.out.println(obj_DB_Connection.addLecture(lecturer));
            }
            //Student
            else{



                System.out.print("Name: \n");
                Scanner scannerStudent = new Scanner(System. in);
                name = scannerStudent. nextLine();


                System.out.print("Username: \n");
                uName = scannerStudent. nextLine();

                System.out.print("Password\n");
                pass = scannerStudent. nextLine();

                System.out.print("Age :\n");

                age = input.nextInt();
                Std student = new Std(name,uName,pass,age);
                System.out.println(obj_DB_Connection.addStudent(student));
            }
        }else if(menuSelector == 2){
            System.out.println("Please select your registration role [1] Lecturer, [2] Student.");
            int roleSelector = input.nextInt();
            if(roleSelector == 1){


            }else{


            }
        }else if(menuSelector==3){


        }else{
            System.out.println("Input error....");
        }
    }
}

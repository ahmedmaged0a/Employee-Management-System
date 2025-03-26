package com.company.inteface;
import com.company.Services.EmployeeServices;
import com.company.model.Employee;
import com.company.utils.Helper;

import java.util.Scanner;

public class interfaces {
    public static Employee[] employees =new Employee[100];
    public static int Last_index;

    public  void System_init(){
        int mode = 0;
        System.out.println("Please Enter Your Mode (Admin Or Employee ?) write 1 for Admin write 2 for Employee");
        System.out.println("****************************************************************");
        Scanner scanner = new Scanner(System.in);
        mode = scanner.nextInt();
        scanner.nextLine();
        switch (mode)
        {
            case 1:
                System.out.println("Admin Mode Selected !!");
                admin();
                break;
            case 2:
                System.out.println("Employee Mode Selected !!");
                Employee();
                break;
            default:
                System.out.println("Invalid Mode !!");
                System.exit(0);
        }
    }
    public void admin(){
        int ID = 0 ;int choice = 0;
        System.out.println("Enter Your ID: ");
        Scanner scanner = new Scanner(System.in);
        ID = scanner.nextInt();
        scanner.nextLine();
        if (Helper.CheckifIDExists(ID)){
            if(Helper.CheckifAdmin(ID))
            {
                System.out.println("Welcome Admin !!");
                System.out.println("You Can Choose between these options: ");
                System.out.println("\t1-Add new Employee");
                System.out.println("\t2-Delete Employee");
                System.out.println("\t3-Update Employee data");
                System.out.println("\t4-View Employee data");
                System.out.println("\t5-calculate Average Salary");
                System.out.println("\t6-getHighestPaidEmployee");
                System.out.println("\t7-Return to main menu");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 1:
                        EmployeeServices.InsertEmployee();
                        break;
                    case 2:
                        EmployeeServices.DeleteEmployee();
                        break;
                    case 3:
                        EmployeeServices.UpdateEmployee();
                        break;
                    case 4:
                        EmployeeServices.ViewEmployee();
                        break;
                    case 5:
                            EmployeeServices.calculateAverageSalary();
                        break;
                    case 6:
                        EmployeeServices.getHighestPaidEmployee();
                        break;
                    case 7:
                        System_init();
                        break;
                    default:
                        System.out.println("Invalid Choice !!");
                }
                System_init();
            }

    }
        else
        {
            if(ID == 1234)
            {
                System.out.println("Welcome Admin !!");
                System.out.println("You Can Choose between these options: ");
                System.out.println("\t1-Add new Employee");
                System.out.println("\t2-Delete Employee");
                System.out.println("\t3-Update Employee data");
                System.out.println("\t4-View Employee data");
                System.out.println("\t5-Return to main menu");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 1:
                        EmployeeServices.InsertEmployee();
                        break;
                    case 2:
                        EmployeeServices.DeleteEmployee();
                        break;
                    case 3:
                        EmployeeServices.UpdateEmployee();
                        break;
                    case 4:
                        EmployeeServices.ViewEmployee();
                        break;
                    case 5:
                        EmployeeServices.calculateAverageSalary();
                        break;
                    case 6:
                        EmployeeServices.getHighestPaidEmployee();
                        break;
                    case 7:
                        System_init();
                        break;
                    default:
                        System.out.println("Invalid Choice !!");
                }
                System_init();
            }
            else
            {
                System.out.println("ID Not Found !!");
                System.exit(0);
            }
        }


    }
    public  void Employee(){
        int id = 0,choice = 0;
        System.out.println("Enter Your ID: ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        scanner.nextLine();
        if(Helper.CheckifIDExists(id))
        {
            System.out.println("Welcome Employee !!");
            System.out.println("You Can Choose between these options: ");
            System.out.println("\t1-View My information");
            System.out.println("\t2-Return to main menu");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    EmployeeServices.ViewEmployee();
                    break;
                case 2:
                    System_init();
                    break;
                default:
                    System.out.println("Invalid Choice !!");
            }
            System_init();
        }
    }
}

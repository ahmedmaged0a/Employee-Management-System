package com.company.Services;

import com.company.model.Employee;
import com.company.utils.Helper;
import com.company.inteface.interfaces;
import java.util.Scanner;

public class EmployeeServices {

    private static String name;
    private static int age;
    private static int ID;
    private static String jobTitle;
    private static double salary;
    static Scanner scanner = new Scanner(System.in);
    public EmployeeServices() {
        name = "";
        age = 0;
        ID = 0;
        jobTitle = "";
        salary = 0.0;
    }
    public static void InsertEmployee() {
        System.out.println("Enter Employee Name: ");
        name=scanner.nextLine();
        System.out.println("Enter Employee Age: ");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee ID: ");
        ID=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Job Title: ");
        jobTitle=scanner.nextLine();
        System.out.println("Enter Employee Salary: ");
        salary=scanner.nextDouble();
        scanner.nextLine();
        if(Helper.CheckifIDExists(ID))
        {
            System.out.println("ID Already Exists !!");
        }
        else
        {
            interfaces.employees[interfaces.Last_index] = new Employee(name,age,ID,jobTitle,salary);
            interfaces.Last_index++;
            System.out.println("Employee Added Successfully !!");
        }

    }
    public static void DeleteEmployee() {
        int id =0;
        System.out.println("Enter Employee ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        if(Helper.CheckifIDExists(id))
        {
            for (int i = 0; i < interfaces.Last_index; i++) {
                if(interfaces.employees[i].getID() == id)
                {
                    interfaces.employees[i] = null;
                    for (int j = i; j < interfaces.Last_index; j++) {
                        interfaces.employees[j] = interfaces.employees[j+1];
                    }
                    interfaces.Last_index--;
                    System.out.println("Employee Deleted Successfully !!");
                    break;
                }
            }
        }
        else
        {
            System.out.println("ID Not Found !!");
        }
    }
    public static void UpdateEmployee() {
        int id =0;
        System.out.println("Enter Employee ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        if(Helper.CheckifIDExists(id))
        {
            for (int i = 0; i < interfaces.Last_index; i++) {
                if(interfaces.employees[i].getID() == id)
                {
                    System.out.println("Enter Employee Name: ");
                    name=scanner.nextLine();
                    System.out.println("Enter Employee Age: ");
                    age=scanner.nextInt();
                    System.out.println("Enter Employee Job Title: ");
                    jobTitle=scanner.nextLine();
                    System.out.println("Enter Employee Salary: ");
                    salary=scanner.nextDouble();
                    interfaces.employees[i] = new Employee(name,age,id,jobTitle,salary);
                    System.out.println("Employee Updated Successfully !!");
                    break;
                }
            }
        }
        else
        {
            System.out.println("ID Not Found !!");
        }
    }
    public static void ViewEmployee() {
        int id =0;
        System.out.println("Enter Employee ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        if(Helper.CheckifIDExists(id))
        {
            for (int i = 0; i < interfaces.Last_index; i++) {
                if(interfaces.employees[i].getID() == id)
                {
                    System.out.println("Employee Name: "+interfaces.employees[i].getName());
                    System.out.println("Employee Age: "+interfaces.employees[i].getAge());
                    System.out.println("Employee Job Title: "+interfaces.employees[i].getJobTitle());
                    System.out.println("Employee Salary: "+interfaces.employees[i].getSalary());
                    break;
                }
            }
        }
        else
        {
            System.out.println("ID Not Found !!");
        }

    }
    public static void calculateAverageSalary() {
        double sum = 0;
        for (int i = 0; i < interfaces.Last_index; i++) {
            sum += interfaces.employees[i].getSalary();
        }
        System.out.println("Average Salary is: "+sum/interfaces.Last_index);

    }
    public static void getHighestPaidEmployee(){
        double max = interfaces.employees[0].getSalary();
        int index = 0;
        for (int i = 1; i < interfaces.Last_index; i++) {
            if(interfaces.employees[i].getSalary() > max)
            {
                max = interfaces.employees[i].getSalary();
                index = i;
            }
        }
        System.out.println("Highest Paid Employee is: "+interfaces.employees[index].getName());
    }

}


package com.company.model;

public class Employee {
    private String name;
    private int age;
    private int ID;
    private String jobTitle;
    private double salary;

    public Employee() {
             name = "";
             age = 0;
             ID = 0;
            jobTitle = "";
            salary = 0.0;
    }
    public Employee(String name, int age, int ID, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }
}

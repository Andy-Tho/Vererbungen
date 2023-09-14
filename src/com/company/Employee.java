package com.company;

public class Employee extends Person{
    private String employeeID;
    private float salary;
    private float salaryIncrease;


    public Employee(String name, String fName, String employeeID, int age) { //Kontruktor Employee erstellen
        super(name, fName);
        this.employeeID = employeeID;
        this.age = age;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    public String getEmployeeID(){
        return this.employeeID;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(){
        return this.salary;
    }
    public void salaryIncrease(float salaryIncrease){
        this.salary += salaryIncrease;
    }
    public void printAll(){
        System.out.println(getName() + " " + getEmployeeID() + " " + getSalary() + " " + age);
    }
}

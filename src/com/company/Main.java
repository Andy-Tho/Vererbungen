package com.company;

public class Main {

    public static void main(String[] args) {
        Employee A = new Employee("Andy", "Krenn", "1345", 16);
        A.printAll();
        A.setName("changed", "name");
        System.out.println(A.getName());
        A.setSalary((float) 15.8);
        System.out.println(A.getSalary());
        A.salaryIncrease(3);
        System.out.println(A.getSalary());
        A.setEmployeeID("0000");
        System.out.println(A.getEmployeeID());
        A.printAll();
    }
}
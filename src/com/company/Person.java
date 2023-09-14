package com.company;

public class Person {
    private String name;
    private String fName;
    public int age;

    public Person(String name, String fName){ //Konstruktor Person erstellen
        this.name = name;
        this.fName = fName;
        this.age = age;
    }
    public Person(){ //leeren Konstruktor erstellen (wenn Person ohne Daten erstellt werden soll)

    }
    public void setName(String name, String fName){
        this.name = name;
        this.fName = fName;
    }
    public String getName(){
        return this.name + " " + this.fName;
    }
}

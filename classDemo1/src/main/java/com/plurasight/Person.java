package com.plurasight;

public class Person {
    private String FullName;
    private int Age;
    private String PersonProfession;

    public Person(String fullName, int age, String profession){
        this.FullName = fullName;
        this.Age = age;
        this.PersonProfession = profession;
    }

    public String getFullName(){
        return this.FullName;
    }
    public void setFullName(String fullName){
        this.FullName = fullName;
    }

    public  int getAge(){
        return  this.Age;
    }
    public void setAge(int age){
        this.Age = age;
    }

    public String getProfession(){
        return  this.PersonProfession;
    }
    public void setProfession(String profession){
        this.PersonProfession = profession;
    }
    
}

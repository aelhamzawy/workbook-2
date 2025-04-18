package com.plurasight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);

        String FullName;
        int Age;
        String PersonProfession;

        System.out.print("What is the person full name? ");
        FullName = InputScanner.nextLine();

        System.out.print("What is the person age? ");
        Age = InputScanner.nextInt();
        InputScanner.nextLine();

        System.out.print("What is the person Profession? ");
        PersonProfession = InputScanner.nextLine();


        System.out.println("The person name is : "+ FullName);
        System.out.println("The person age is : "+ Age);
        System.out.println("The person profession is : "+ PersonProfession);

//        System.out.printf("Person full name is %s \n person age is %d \n person profession is %s: ", FullName, Age, PersonProfession);


        Person thePerson = new Person(FullName,Age,PersonProfession);


    }
}
package com.plurasight;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String getFullName = getFullName();
        displayName(getFullName);
    }

//    creating a function to get the value input from the user
    public static String getFullName(){
        Scanner InputScanner = new Scanner(System.in);
        String FullName;
        System.out.print("Please Enter Your Full Name: ");
        FullName = InputScanner.nextLine();
        return  FullName;


    }

    public static void displayName(String fullNameValue){
        String[] newFullName = fullNameValue.split(Pattern.quote(" "));
        String fName;
        String mName;
        String lName;
        for(int i = 0; i < newFullName.length;i++){
            String eachName = newFullName[i];
            System.out.println(eachName);
        }
    }
}
package com.plurasight;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        String[] fullName = getTheUserFullName();
        printFullName(fullName);




    }

//    creating a function to get the information from the user
    public static String[] getTheUserFullName(){


        Scanner InputScanner = new Scanner(System.in);

//        creating the main full name variables
        String firstName;
        String middleName;
        String lastName;
        String suffix;




//        creating the prompts to get the values from the user

        System.out.print("Please Enter Your First Name: ");
        firstName = InputScanner.nextLine();

        System.out.print("Please Enter Your Middle Name: ");
        middleName = InputScanner.nextLine();

        System.out.print("Please Enter Your Last Name: ");
        lastName = InputScanner.nextLine();

        System.out.print("Please Enter Your Suffix: ");
        suffix = InputScanner.nextLine();
        String fullName[] = {firstName,middleName,lastName,suffix};
         return fullName;
    };


//    create a function to validate and print the full name
    public static void printFullName(String fullName[]){

        ArrayList<String> emptyInputField = new ArrayList<>();

        for (int i =0; i < fullName.length;i++){
            String emptyString = "";
            String eachInputValue = fullName[i];
            if (eachInputValue.equals(emptyString)){
                emptyInputField.add(eachInputValue);
            }
            else {

                System.out.print(eachInputValue+ " ");
            }
        }

    }
}
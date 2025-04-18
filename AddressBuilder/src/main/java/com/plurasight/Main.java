package com.plurasight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String BillingAddress = getBillingAddress();
    String ShippingAddress = getShippingAddressInfo();

        displayTheUserInfo(BillingAddress,ShippingAddress);

    }

//    CREATING A FUNCTION TO GET THE BILLING ADDRESS INFORMATION FROM THE USER
    public static String getBillingAddress(){
//        CREATING THE STRING BUILDER OBJECT TO COLLECT ALL THE BILLING ADDRESS INFO IN ONE PLACE
      StringBuilder billingAddressInfo = new StringBuilder();
      Scanner InputScanner = new Scanner(System.in);

//      CREATING THE MAIN VARIABLE FOR THE BILLING ADDRESS
        String street;
        String city;
        String state;
        int zipCode;


        System.out.println("Enter Your Billing Address Information Below: ");
      System.out.print("Enter Your Street: ");
      street = InputScanner.nextLine();

      System.out.print("Enter Your City Name: ");
      city = InputScanner.nextLine();

      System.out.print("Enter Your State Name: ");
      state = InputScanner.nextLine();

      System.out.print("Enter Your Zip Code Number: ");
      zipCode = InputScanner.nextInt();
      System.out.println("----------------------------------------------------");



        billingAddressInfo.append(street).append(" ");
        billingAddressInfo.append(city).append(" ");
        billingAddressInfo.append(state).append(" ");
        billingAddressInfo.append(zipCode).append(" ");

        String fullBillingAddress =  billingAddressInfo.toString();
        return  fullBillingAddress;


    };

//     CREATING A FUNCTION TO GET THE SHIPPING ADDRESS INFORMATION FROM THE USER
    public static String getShippingAddressInfo(){
        StringBuilder shippingAddressInfo = new StringBuilder();
        Scanner InputScanner = new Scanner(System.in);


        //      CREATING THE MAIN VARIABLE FOR THE BILLING ADDRESS
        String street;
        String city;
        String state;
        int zipCode;


        System.out.println("Enter Your Shipping Address Information Below: ");
        System.out.print("Enter Your Street: ");
        street = InputScanner.nextLine();

        System.out.print("Enter Your City Name: ");
        city = InputScanner.nextLine();

        System.out.print("Enter Your State Name: ");
        state = InputScanner.nextLine();

        System.out.print("Enter Your Zip Code Number: ");
        zipCode = InputScanner.nextInt();



        shippingAddressInfo.append(street).append(" ");
        shippingAddressInfo.append(city).append(" ");
        shippingAddressInfo.append(state).append(" ");
        shippingAddressInfo.append(zipCode).append(" ");

        String fullShippingAddress =  shippingAddressInfo.toString();
        return  fullShippingAddress;

    }

//    CREATING A FUNCTION TO DISPLAY THE BILLING ADDRESS AND SHIPPING ADDRESS FOR THE USER
    public static void displayTheUserInfo(String BillingInfo, String ShippingInfo){
        System.out.printf("Billing Address is %s: \n", BillingInfo);
        System.out.printf("Billing Address is %s: \n", ShippingInfo);

    }
}
package com.plurasight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;


        CellPhone cellPhone1 = new CellPhone();

        Scanner InputScanner = new Scanner(System.in);


        System.out.print("Enter the serial Number: ");
        serialNumber = InputScanner.nextInt();
        InputScanner.nextLine();

        System.out.print("Enter the Model: ");
        model = InputScanner.nextLine();

        System.out.print("Enter the carrier: ");
        carrier = InputScanner.nextLine();

        System.out.println("Enter the phone number: ");
        phoneNumber = InputScanner.nextLine();


        System.out.println("Enter the owner: ");
        owner = InputScanner.nextLine();

        System.out.println(cellPhone1.getSerialNumber());


    }
}

package com.plurasight;

public class WhileLoop {
    public static void main(String[] args) {

        printText(5,0,"I Love Java");
    }

    public static void printText(int printNumber, int counterNumber, String text){
        while (counterNumber < printNumber){
            System.out.println(text);
            counterNumber++;
        }

    }
}
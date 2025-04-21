package com.plurasight;



public class DoWhileLoop {

    public static void main(String[] args){

        printNumber(0,4,"I Love Java");
    }

    public static void printNumber(int counter, int printNumber, String text){
        do{
            System.out.println(text);
            counter++;
        }
        while(counter < printNumber);
    }
};



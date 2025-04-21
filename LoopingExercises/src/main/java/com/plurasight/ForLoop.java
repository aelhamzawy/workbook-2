package com.plurasight;

public class ForLoop {
    public static void main(String[] args){
        printText(10,0);
    }

    public static void printText(int counterNumber, int printNumber){
        for(int i = counterNumber; i >= printNumber; i--){
            try{
                if(i == 0){
                    System.out.print("Launch Time");
                    break;
                }else{
                    System.out.println(i);
                    Thread.sleep(1000);
                }

            }
            catch(InterruptedException e){
                System.out.print("un expected error");
            }


        }
    }
}

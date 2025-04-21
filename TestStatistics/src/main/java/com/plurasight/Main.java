package com.plurasight;

public class Main {
    public static void main(String[] args) {
        int[] testScores = {85, 90, 78, 92, 88, 76, 95, 89, 84, 91};


        float average;
        int highScore = testScores[0];
        int lowScore = testScores[0];
        int totalScore = 0;



        for (int i = 0; i < testScores.length; i++){
            int eachScore = testScores[i];
            totalScore += eachScore;


            if (eachScore > highScore){
                highScore = eachScore;
            }

            if(eachScore < lowScore){
                lowScore = eachScore;
            }



        }
        average = (totalScore / testScores.length);
        System.out.println("Total Average of the test score is: "+ average);
        System.out.println("The Low Score is: "+ lowScore);
        System.out.println("The high Score is: "+ highScore);

    }
}
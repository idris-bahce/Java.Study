package Listings;

import java.util.Scanner;

public class SubstructionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 5;
        int counter = 0;
        int trueCounter = 0;
        int falseCounter = 0;
        int question = 1;

        while (counter<NUMBER_OF_QUESTIONS){
            int num1 = (int)(Math.random() * 21);
            int num2 = (int)(Math.random() * 21);
            if(num1<num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println(question +". " + num1 + "-" + num2 + " = ?");
            int answer = in.nextInt();
            if(num1 - num2 == answer){
                System.out.println("TRUE!!");
                trueCounter++;
            }else {
                System.out.println("FALSE!!!");
                falseCounter++;
            }
            counter++;
            question++;
        }
        System.out.println("You made " + trueCounter + " of the questions true.");
        System.out.println("You made " + falseCounter + " of the questions false.");
    }
}

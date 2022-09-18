package Listings;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        System.out.println(num1 + " + " + num2 + " = ?");
        int answer = in.nextInt();
        int counter = 0;
        while(answer != num1 + num2){
            System.out.println("Try again.");
            System.out.println(num1 + " + " + num2 + " = ?");
            answer = in.nextInt();
            counter++;
        }
        if(counter>0){
            System.out.println("At the end! True!");
        }else {
            System.out.println("True! Very well!!!");
        }
    }
}

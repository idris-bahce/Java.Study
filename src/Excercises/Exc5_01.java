package Excercises;

import java.util.Scanner;

public class Exc5_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfPositive = 0;
        int numOfNegative= 0;
        System.out.println("Enter the numbers for average. Enter 0 if you want to terminate:");
        double num = in.nextDouble();
        if(num<0)
            numOfNegative++;
        if(num>0)
            numOfPositive++;
        double sum = 0;
        int counter = 0;
        while (num!=0){
            sum += num;
            num = in.nextDouble();
            if(num<0)
                numOfNegative++;
            if(num>0)
                numOfPositive++;
            counter++;
        }
        System.out.println("There were " + numOfPositive + " positives.");
        System.out.println("There were " + numOfNegative + " negatives.");
        System.out.println(sum/counter);
    }
}

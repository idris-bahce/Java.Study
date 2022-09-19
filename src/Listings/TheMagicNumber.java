package Listings;

import java.util.Scanner;

public class TheMagicNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num = (int)(Math.random() * 101);
        System.out.println("Guess the magic number:");
        int guess = in.nextInt();
        while (guess != num){
            if (num < guess){
                System.out.println("Your guess is too high!");
            } else if (num>guess) {
                System.out.println("Your guess is too low!");
            }
            System.out.println("Guess the magic number:");
            guess = in.nextInt();
        }
        System.out.println("True!");
    }
}

package Listings;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers you want to sum:(enter zero to terminate)");
        int input = in.nextInt();
        while (input != 0){
            sum += input;
            input = in.nextInt();
        }
        System.out.println("The sum is" + sum);
    }
}

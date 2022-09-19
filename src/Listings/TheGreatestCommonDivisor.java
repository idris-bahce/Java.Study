package Listings;

import java.util.Scanner;

public class TheGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two intigers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int gcd = 0;
        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }
        for (int i=1; i<=num1;i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("The greatest commen divisor is: " + gcd);
    }
}

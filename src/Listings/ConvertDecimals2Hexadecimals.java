package Listings;

import java.util.Scanner;

public class ConvertDecimals2Hexadecimals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int decimal = in.nextInt();
        int hexNum = 0;
        String hexNumber ="";

        while(decimal>0){
            hexNum = decimal % 16;
            if(10<=hexNum && hexNum<=15){
                char ch = (char) ((hexNum - 10) + 'A');
                hexNumber = ch + hexNumber;
            }  else {
                hexNumber = hexNum + hexNumber;
            }

            decimal/=16;
        }
        System.out.println(hexNumber);
    }
}

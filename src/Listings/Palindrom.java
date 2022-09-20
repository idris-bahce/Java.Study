package Listings;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.next();
        word = word.toUpperCase().trim();
        int letterNum = word.length();
        boolean isPalindrom = true;
        for (int i = 0; i <= letterNum/2;i++){
            for(int j = letterNum - 1;j<letterNum;j--){
                if(word.charAt(i)==word.charAt(j)){
                    isPalindrom=true;
                    break;
                }else {
                    isPalindrom = false;
                    break;
                }
            }
        }
        if(isPalindrom) {
            System.out.println(word + " is a palindrom.");
        }else {
            System.out.println("It is not a palindrom.");
        }
    }
}

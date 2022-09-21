package Excercises;

import java.util.Scanner;

public class Exc5_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line:");
        int line = in.nextInt();
        int counter = 0;
        int space = line;
        int forLoop2 = line - 1;
        int forLoop3 = line -(line-2);
        while (counter<line){
            for (int i = space; i > 0;i--) {
                System.out.print("   ");
            }
            for (int i = line - forLoop2;i>0;i--){
                System.out.printf("%3d",i);
            }
            for (int i = 2;i< forLoop3 ;i++){
                System.out.printf("%3d",i);
            }
            System.out.println();
            forLoop3++;
            counter++;
            space--;
            forLoop2--;
        }
    }
}

package Excercises;

import java.util.Scanner;

public class Exc5_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the students:");
        int numOfStudents = in.nextInt();
        int counter = 1;
        System.out.println("Enter the students name and their mark:");
        String name = in.next();
        int mark = in.nextInt();
        int first= mark;
        int second = 0;
        String name2 = "";
        String name1 = name;
        while (counter<numOfStudents) {
            name2 = in.next();
            second = in.nextInt();
            if(first<second){
                first = second;
                name1 = name2;
            }else if (second<first){
                second = first;
                name2=name1;
            }
            counter++;
        }
        System.out.println(name1 + " has the highest mark: " + first);
        System.out.println(name2 + " has the second highest mark: " + second);
        }
    }


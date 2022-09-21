package Excercises;

public class Exc5_13 {
    public static void main(String[] args) {
        final int TERMINATE = 12_000;
        int counter = 0;
        int x = 0;
        while (counter<TERMINATE){
            x++;
            counter=x*x*x;
        }
        System.out.println(counter);
        System.out.println(x - 1);
    }
}

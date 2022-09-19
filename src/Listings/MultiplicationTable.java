package Listings;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t\t   MULTIPLICATION TABLE");
        System.out.print("    ");
        for (int i = 1; i <= 10; i++){
            System.out.printf("%4d", i);
        }
        System.out.println("\n--------------------------------------------");

        for (int i = 1; i <= 10; i++){
            System.out.printf("%2d %-1s",i, "|");
            for (int j = 1; j <= 10; j++){
                System.out.printf(" %3d", j*i);
            }
            System.out.println();
        }
    }
}

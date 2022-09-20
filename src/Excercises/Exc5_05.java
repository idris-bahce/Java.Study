package Excercises;

public class Exc5_05 {
    public static void main(String[] args) {
        System.out.println("kg \t\t pounds \t|\t pounds \t kg");
        System.out.println("---------------------------------------");
        double pound = 20;
        for (double kg = 1 ; kg<200;kg+=2){
            double pounds = kg * 2.2;
            System.out.printf("%6.2f %8.2f %5s",kg, pounds, "|");
            while ( pound<516){
                double kilo = pound / 2.2;
                System.out.printf("%8.2f %10.2f",pound, kilo);
                break;
            }
            pound+=5;
            System.out.println();
        }
    }
}

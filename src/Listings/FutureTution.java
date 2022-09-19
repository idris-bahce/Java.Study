package Listings;

public class FutureTution {
    public static void main(String[] args) {
        double tution = 10000;
        double twoTimesTution = tution * 2;
        double interestRate = 1.07;
        int year =0;
        while (tution<twoTimesTution){
            tution = tution * interestRate;
            year++;
        }
        System.out.println(year);
    }
}

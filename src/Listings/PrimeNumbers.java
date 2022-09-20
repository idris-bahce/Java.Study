package Listings;

public class PrimeNumbers {
    public static void main(String[] args) {
        int primeNumbers = 2;
        int counter = 0;
        int nextLine = 0;
        System.out.println("Prime numbers are:");
        while (counter<50){
            int divisor = 2;
            boolean isPrimeNumber = true;
            while (divisor<=primeNumbers/2){
                if(primeNumbers % divisor == 0){
                    isPrimeNumber = false;
                    break;
                }
                divisor++;
            }
            if(isPrimeNumber) {
                System.out.printf("%4d",primeNumbers);
                nextLine++;
                if (nextLine % 10 == 0) {
                    System.out.println();
                }
                counter++;

            }
            primeNumbers++;
        }

    }
}

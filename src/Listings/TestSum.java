package Listings;

public class TestSum {
    public static void main(String[] args) {
        double sum = 0;
        double x = 0.01;
        for (int i= 1;i <= 100; i++ ){
           sum+=x;
           x+=0.01;
        }
        System.out.println(sum);
    }
}

package Excercises;

public class Exc5_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        double sum = 0;
        for (int i = 0; i <10 ;i++){
           tuition += tuition * 0.05;
        }
        System.out.println("The tuition after ten years: " + tuition);
        for (int i = 0; i <4 ;i++){
            tuition += tuition * 0.05;
            sum += tuition;
        }
        System.out.println("The amount you will pay is:" + sum);
    }
}

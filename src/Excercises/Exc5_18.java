package Excercises;

public class Exc5_18 {
    public static void main(String[] args) {
       a();
       b();
       c();
       d();
    }
    public static void a(){
        for (int i = 1; i<=6;i++){
            for (int j = 1;j<=i;j++){
                System.out.printf("%2d",j);
            }
            System.out.println();
        }
    }
    public static void b(){
        for (int i = 6; i >0 ; i--){
            for (int j = 1; j <= i;j++){
                System.out.printf("%2d",j);
            }
            System.out.println();
        }
    }
    public static void c(){
        int spaceDecraser = 6;
        int forLoop2 = 1;
        for (int i = 0; i<6;i++){
            for (int j = spaceDecraser; j > 0;j--){
                System.out.print("   ");
            }
            for (int j = forLoop2; j > 0 ; j--){
                System.out.printf("%3d",j);
            }
            System.out.println();
            spaceDecraser--;
            forLoop2++;
        }
    }
    public static void d(){
        int forLoop1 = 6;
        int forLoop2 = 1;
        for (int i = 0; i < 6; i++){
            for (int j = 1; j<=forLoop1;j++){
                System.out.printf("%2d",j);
            }
            System.out.println();
            for (int j = 0; j < forLoop2;j++){
                System.out.print("  ");
            }

            forLoop2++;
            forLoop1--;
        }
    }
}

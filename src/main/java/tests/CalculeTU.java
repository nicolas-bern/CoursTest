package tests;

public class CalculeTU {

    public static int sommeDeuxEntiers(int a, int b){
        if(a <= 0 || b <= 0){
            throw new IllegalArgumentException();
        } else {
            return a + b;
        }
    }

    public static int produitDeuxEntiers(int a, int b){
        return a * b;
    }

    public static int soustractionDeuxEntiers(int a, int b){
        return a - b;
    }

    public static int divisionDeuxEntiers(int a, int b){
        return a / b;
    }

    public static double calculeCarre(double a){
        return a * a;
    }
}

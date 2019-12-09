package ua.alevel.lesson51;

public class TrygonometricCalculator {

    public static double getSinus(double argument) {
        Application.getDivision(777, 555);
        return Math.sin(argument);
    }

    public static double getCosine(double argument) {
        return Math.cos(argument);
    }

    public static double getSinSquare(double argument) {
        return getSinus(argument)*getSinus(argument);
    }

    public static double getCosineSquare(double argument) {
        return getCosine(argument)*getCosine(argument);
    }

    public void foo() {
        System.out.println("foo");
    }

    public static void boo() {
        System.out.println("boo");
    }
}

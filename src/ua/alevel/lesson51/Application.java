package ua.alevel.lesson51;

public class Application {
    public static void main(String[] args) {
        System.out.println("Calculator started ...");

        int firstArg = 100;
        int secondArg = 21;

        int answerSum = getSum(firstArg, secondArg);
        int answerSubstract = getSubstruct(firstArg, secondArg);
        int answerMultiplie = getMultiplie(firstArg, secondArg);
        double answerDivision = getDivision(firstArg, secondArg);

        System.out.println(answerSum +
                " " + answerSubstract +
                " " + answerMultiplie +
                " " + answerDivision);

        double mySin = TrygonometricCalculator.getSinus(firstArg);
        double myCos = TrygonometricCalculator.getCosine(firstArg);

        System.out.println(mySin + " " +myCos);
        System.out.println(TrygonometricCalculator.getSinSquare(firstArg)
                + TrygonometricCalculator.getCosineSquare(firstArg));

        TrygonometricCalculator trygonometricCalculator = new TrygonometricCalculator();
        TrygonometricCalculator trygonometricCalculator1 = new TrygonometricCalculator();

        trygonometricCalculator.foo();
        trygonometricCalculator1.foo();

        TrygonometricCalculator.boo();
    }

    public static int getSum(int firstArg, int secondArg) {
        return firstArg + secondArg;
    }

    public static int getSubstruct(int firstArg, int secondArg) {
        return firstArg - secondArg;
    }

    public static int getMultiplie(int firstArg, int secondArg) {
        return firstArg * secondArg;
    }

    public static double getDivision(int firstArg, int secondArg) {
        return firstArg / secondArg;
    }

}

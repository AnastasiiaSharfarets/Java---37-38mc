package HW01;

public class Main {
    public static void main(String[] args) {
        //int a;
        //double b;
        System.out.println(getSum(12, 13.7));
        System.out.println(getSquare(23, 43.2));
        double sum = getSum(12, 99.9);
        System.out.println(sum);
        printMinusResult(50, sum);
        printDivisionResult(500, getSquare(12, sum));
    }

    public static double getSum(int a, double b) {
        return a + b;
    }

    public static double getSquare(int a, double b) {
        double c;
        c = a * b;
        return c;
    }

    public static void printMinusResult(int a, double b) {
        double c = a - b;
        System.out.println(c);
    }

    public static void printDivisionResult(int a, double b) {
        double c = a / b;
        System.out.println("Division " + c);
    }

}

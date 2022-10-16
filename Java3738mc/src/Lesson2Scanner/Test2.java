import java.util.Scanner;

public class Test2 {
    static int get(int a) {
        return a * 10;
    }

    static double get1(double b) {
        return b % 2;
    }

    static void getNum(double a, int b) {
        System.out.println(a + b);
    }

    public static void getResult(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static double getSum(double f1, int f2, int f3) {
        double result = f1 * f2 * f3;
        return result;
    }

    public static double getXZ(double f1, int f2, int f3) {
        double res = f1 * f2 * f3;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int b = (int) getSum(12.3, 23, scanner.nextInt());
        int c = get(scanner.nextInt());
        System.out.println(getXZ(a, b, c));

        //getSum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(getSum(a, b, c));
        //int i = scanner.nextInt();
        //getResult(scanner.nextInt(), i);
        //getNum(scanner.nextDouble(), scanner.nextInt());
        //get(scanner.nextInt());
        //System.out.println(get(scanner.nextInt()));
        //System.out.println(get1(scanner.nextInt()));
        //System.out.println(getNum(scanner.nextInt(), scanner.nextInt()));
    }
}

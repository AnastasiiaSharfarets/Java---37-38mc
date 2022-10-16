package Lesson3;

public class Casting {
    static byte b = (byte) 200; // -128  +127
    short s;
    double d = 65445.6;
    float f = (float) 9999.5;
    float f1 = 9999.5f;

    static char c = 9999;
    static int i1 = c; //[ ]
    static int i = 999;

    static String str; // [str] -> [ ]

    public static void main(String[] args) {
        //System.out.println(c);
        str = String.valueOf(i);//метод класса стринг, возвращает строковое предствление от инта
        System.out.println(str);
        System.out.println(5 + "" + 5);
        System.out.println(5 + 5);
        System.out.println("Мама" + " мыла");
        Person person = new Person(23, "Vera");
    }
}

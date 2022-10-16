package Lesson5;

import java.util.Arrays;

public class Test1 {
    String name;
    String age;

    public Test1(String name, String age) {
        this.name = name;
        this.age = age;
    }
}

class Main1 {
    //static int a = 0;

    public static void main(String[] args) {
        int a = 0;
        char[] array = new char[11];
        int[] array1 = {1, 2, 3, 4};
        for (char i = 'a'; i < array.length; i++) {
            array[a] = i;
        }
        a++;
        System.out.println(array);
        System.out.println(Arrays.toString(array));
    }
}


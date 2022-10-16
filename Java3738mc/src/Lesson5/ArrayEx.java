package Lesson5;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx {
    public static void main(String[] args) {
        /* int[] array = new int[5];
        int[] array1 = {98, 4, 4, 89, 3, 0, 56};
        char[] charArray = new char[5];
        int a = 5;
        String[] stringArray = new String[6];
        System.out.println(Arrays.toString(array1));
*/
        //char[] chars = {'d', 'u',};
        //Parent[] parent = new Parent[22];
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i]=new Random().nextInt(55);

        }
        System.out.println(Arrays.toString(array));
    }
}

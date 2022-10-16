package HW03;

import java.util.Arrays;
import java.util.Random;

//Создать ПУСТОЙ массив чисел длиной 22
public class EmptyArray {
    public static void main(String[] args) {
        int[] array = new int[22];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

        int i = array.length - 1;
        while (i >= 0) {
            array[i] = array.length - 1 - i;
            i--;
        }
        System.out.println(Arrays.toString(array));

        System.out.print("[");
        for (int a : array
        ) {
            System.out.print(a + " ");

        }
        System.out.print("]");
        System.out.println();

        Random rnd = new Random();
        for (int j = 0; j < array.length; j++) {
            int currentValue = rnd.nextInt();
            if (currentValue >= 0) {
                array[j] = currentValue;
            } else {
                array[j] = -currentValue;
            }
        }
        System.out.println(Arrays.toString(array));

        char[] arr1 = new char[4];
        randomChar(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    //Сделать метод, в качестве параметра принимет ПУСТОЙ массив char и
// далее заполняет этот массив рандомными символами типа char.
//Вывести этот массив на экран.
    public static void randomChar(char[] arr) {
        Random rnd = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (char) rnd.nextInt(65536);
        }
    }

}

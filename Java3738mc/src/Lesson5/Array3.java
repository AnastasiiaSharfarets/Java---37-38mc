package Lesson5;

import java.util.Arrays;

public class Array3 {
    int[] arr;
    String[] arr1;

    public Array3(int[] arr, String[] arr1) {
        this.arr = arr;
        this.arr1 = arr1;
    }

    @Override
    public String toString() {
        return "Array3{" +
                "arr=" + Arrays.toString(arr) +
                ", arr1=" + Arrays.toString(arr1) +
                '}';
    }
}

class Main3 {
    public static void main(String[] args) {
        Array3 anna = new Array3(new int[2], new String[2]);
        System.out.println(anna);

    }
}

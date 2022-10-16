package Lesson5;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = {1, 2, 3, 4};
        for (int i = 0; i < 3; i++) {
            arr1[i]= (i + 3) * 3;
        }
        System.out.println(java.util.Arrays.toString(arr1));
    }
}

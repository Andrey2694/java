package codewars;

import java.util.Arrays;

//https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java
public class Task7 {
    public static int[] multipleOfIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i] % i == 0) {
                    count++;
                }
            }
        }
        int[] arr = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i] % i == 0) {
                    arr[count] = array[i];
                    count++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25})));
    }

}

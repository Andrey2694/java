package codewars;

import java.util.Arrays;
//https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java
public class Task6 {

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] arr = new int[2];
        int count = 0;
        int sum = 0;
        if (input == null || input.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            }else if (input[i] < 0) {
                sum += input[i];
            }
        }
        arr[0] = count;
        arr[1] = sum;


        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(a)));
    }

}


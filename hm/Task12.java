package hm;

import java.util.Arrays;

/*
 * С помощью методов класса Math построить массив int[] из 10 случайных положительных трехзначных чисел
 *       (random numbers). Числа должны быть не больше 100.
 *
 * С помощью методов класса Math построить новый массив double[],
 *       в котором содержится квадратный корень каждого значения массива randomArray
 */
public class Task12 {
    static int[] randomArray (int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i ++) {
            arr[i] = (int)Math.round(Math.random() * 100);
        }
        return arr;
    }
    static double[] squareRoot (int[] array) {
        double[] arr = new double[array.length];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = Math.sqrt(array[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray(10)));
        System.out.println(Arrays.toString(squareRoot(randomArray(10))));
    }
}

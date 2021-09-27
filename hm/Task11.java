package hm;

import java.util.Arrays;

/*С помощью методов класса Math (догадайтесь по названиям) из массива {-13, 9, -314, -89, 98, 52, -4}:
 *      построить новый массив, в котором все числа - положительные
 *      построить новый массив, в котором все числа - отрицательные
 */
public class Task11 {
    public static void main(String[] args) {
        int[] arr = {-13, 9, -314, -89, 98, 52, -4};
        int[] arrNegative = arrNegative(arr);
        int[] arrPositive = arrPositive(arr);
        System.out.println(Arrays.toString(arrPositive));
        System.out.println(Arrays.toString(arrNegative));
    }

    static int[] arrNegative(int[] arr) {
        int[] arrs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrs[i] = Math.negateExact(arr[i]);
            } else {
                arrs[i] = arr[i];
            }
        }
        return arrs;
    }

    static int[] arrPositive(int[] arr) {
        int[] arrs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arrs[i] = Math.negateExact(arr[i]);
            } else {
                arrs[i] = arr[i];
            }
        }
        return arrs;
    }
}

package hm;

public class Hm3 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int avg = sum / arr.length;
        System.out.println("Сумма значений = " + sum);
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
        System.out.println("Среднее арифмитеческое значение = " + avg);
        System.out.println("___________________________________________");


        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sumArray = 0;
        int maxArray = array[0][0];
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                sumArray += array[i][j];
                if (maxArray < array[i][j]){
                    maxArray = array[i][j];
                }
            }
        }
        System.out.println("Сумма значений вложенных массивов = " + sumArray);
        System.out.println("Максимальное значение вложенных массивов = " + maxArray);
    }

}

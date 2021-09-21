package hm;

public class Task9 {
    /*
     * Дан массив:
     * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
     * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
     */
    public static int countString(String[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[i].length; a++) {
                if (!arr[i][a].contains("е")) {
                    count ++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
        System.out.println(countString(array));
    }
}

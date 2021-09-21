package hm;

public class Task7 {
    /* Дана строка:
     * String s = “Перевыборы выбранного президента”;
     * необходимо подсчитать количество букв “е” в строке.
     * Для указанной строки ответ будет 4.
     */
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count ++ ;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        System.out.println(countLetters(s));
    }
}

package hm;

import java.util.Locale;

public class Task8 {
    /* Дана строка:
     * String s = “Посмотрите как Рите нравится ритм”;
     * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
     * Для указанной строки ответ будет 6, 15, 29.
     */
    public static void stringIndex(String ss, String sss) {
        String s = ss.toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length() - sss.length(); i++) {
            if (s.substring(i, i + sss.length()).equals(sss)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        String ss = "Посмотрите как Рите нравится ритм";
        stringIndex(ss, "рит");
    }
}

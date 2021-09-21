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
        int a = s.indexOf(sss);
        int b = s.indexOf(sss, a + 1);
        int c = s.indexOf(sss, b + 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        String ss = "Посмотрите как Рите нравится ритм";
        stringIndex(ss, "рит");
    }
}

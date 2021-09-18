package hm;

public class Hm3_4 {
    public static void main (String[] args) {

        String max_value = "Максимальное значение типа данных ";
        String min_value = "Минимальное значение типа данных ";
        String line = "__________________________________________________";

        Short short_max = Short.MAX_VALUE;
        System.out.println(max_value + "Shor = " + short_max);
        System.out.println(line);

        Short short_min = Short.MIN_VALUE;
        System.out.println(min_value + "Short = " + short_min);
        System.out.println(line);

        Byte b = Byte.MIN_VALUE;
        System.out.println(min_value + "Byte = " + b);
        System.out.println(line);

        b = Byte.MAX_VALUE;
        System.out.println(max_value + "Byte = " + b);
        System.out.println(line);

        int i = Integer.MAX_VALUE;
        System.out.println(max_value + "int = " + i);
        System.out.println(line);

        Integer ii = Integer.MIN_VALUE;
        System.out.println(min_value + "Integer = " + ii);
        System.out.println(line);

        Integer iI = (Integer) i;
        System.out.println(max_value + "Integer = " + iI);
        System.out.println(line);

        i = (int) ii;
        System.out.println(min_value + "int = " + i);
        System.out.println(line);

        Double d = 10.099 + 20.0999;
        System.out.println(d);
        System.out.println(line);
        Float f = 10.099f + 20.099f;
        System.out.println(f);
        System.out.println(line);
        short ssss = (short)(8000 * 4000);
        int ssss1 = (8000 * 4000);
        System.out.println("ssss = " + ssss);
        System.out.println("ssss1 " + ssss1);
        System.out.println(line);
        Short sss = (short)(800 +  d);
        System.out.println("sss = " + sss);
        System.out.println(line);
        long number = (Integer.MAX_VALUE) +  1L;
        System.out.println(number);
        System.out.println(line);
        long number1 = (Integer.MIN_VALUE) - 10000L;
        System.out.println(number1);
        System.out.println(line);
        double pi = 3.14;

        String alphabet = "a b c d ....";

        float ee = 2.718f;

        char c = 'a';

        char cc = 'а';

        System.out.println((int)c + "   " + (int)cc);
        System.out.println(line);

        char c1 = (char) (c + 25);
        char cc1 = (char) (cc + 31);
        System.out.println(c1 + "    " + cc1);


    }
}

package hm;

public class Hm5_6 {
    public static void main(String[] args) {
        doubleNumbers(2);
        doubleNumbers(5);
        doubleNumbers(14);
        doubleNumbers(67);
        doubleNumbers(0);
        System.out.println("____________________________________________");
        digitNumbers(5);
        digitNumbers(55);
        digitNumbers(555);


    }
    public static void doubleNumbers(int a) {
        int i = a;
        if ( i % 2 == 0) {
            System.out.println(i * 2);
        }
    }
    public static void digitNumbers(int a ) {
        String digit = String.valueOf(a);
        System.out.println(digit.length() + " разрядное число");
    }
}

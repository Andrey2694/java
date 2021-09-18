package hm;

import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 15; i++) { // 1
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10000; i *= 5) { // 2
            System.out.println(i);
        }
        for (int i = 40; i <= 60; i++) {    // 3
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("_____________________");
        for (int i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }
        int a = 1;
        int b = 2;
        if (a == b) {
            System.out.println("a == b");
        } else  if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        }
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("put first number");
        int scanA = scan.nextInt();
        System.out.println("put second number");
        int scanB = scan2.nextInt( );
        if ((scanA + scanB) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
        int c = scanA;
        if (c > 10) {
            System.out.println("больше 10");
        }
        if (c < 100) {
            System.out.println("меньше 100");
        }
        if ((c / 2) >= 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (c >= 5 && c <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}



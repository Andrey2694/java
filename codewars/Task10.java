package codewars;

//https://www.codewars.com/kata/5545f109004975ea66000086/train/java
public class Task10 {
    public static boolean isDivisible(long n, long x, long y) {
        if (n % x == 0 && n % y == 0) {
            return true;
        } else {
            return false;
        }
    }
}

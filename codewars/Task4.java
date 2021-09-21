package codewars;

//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
public class Task4 {
    public static int findSmallestInt(int[] args) {
        int smallestInt = 0;
        if (args != null || args.length != 0) {
            smallestInt = args[0];
            for (int i = 0; i < args.length; i++) {
                if (smallestInt > args[i]) {
                    smallestInt = args[i];
                }
            }
        }
        return smallestInt;
    }
}


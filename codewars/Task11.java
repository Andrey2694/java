package codewars;

//https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
public class Task11 {
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && c + b > a;
    }
}

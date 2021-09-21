package codewars;

//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
public class Task5 {
    public static String countingSheep(int num) {
        if (num > 0) {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                builder.append(i + " sheep...");
            }
            return builder.toString();
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(1));
    }
}

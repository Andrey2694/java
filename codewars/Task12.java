package codewars;

//https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
public class Task12 {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";

        if ((p1 + p2).equals("scissorsrock")  || (p1 + p2).equals("paperscissors") || (p1 + p2).equals("rockpaper")) {
            return "Player 2 won!";
        }else {
            return "Player 1 won!";
        }
    }
}

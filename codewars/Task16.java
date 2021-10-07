package codewars;

//https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java
public class Task16 {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == vacation) {
            return false;
        }
        return employed;
    }
}

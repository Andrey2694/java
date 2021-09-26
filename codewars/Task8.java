package codewars;

//https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
public class Task8 {
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int lengthString = arr[0].length();
        for (String a : arr) {
            if (a.length() < lengthString) {
                lengthString = a.length();
            }
        }
        return lengthString;
    }

    public static void main(String[] args) {
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
    }
}


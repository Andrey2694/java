package hm;
/*Написать метод, который принимает на вход целое положительное число, не больше 10,
 *      и возвращает массив double[], который содержит 10 чисел - степени этого числа (Math.pow())
 */
public class Task10 {
    public static void main(String[] args) {
        getPow(3);
    }
    public static double[] getPow(int i) {
        if (i <= 10 && i >= 0) {
            double[] arr = new double[10];
            for (int c = 0; c < 10; c++) {
                arr[c] = Math.pow(i, c);
                System.out.println(Math.pow(i, c));
            }
            return arr;
        }
        return new double[0];
    }
}

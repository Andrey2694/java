package hm;

public class Hm3_pyramids {
    static String space_sum(int count) {
        String sum = "";
        for (int i = 0; i < count; i++) {
            sum += " ";

        }
        return sum;
    }

    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("________________________________________");
        System.out.println();
        int a = 0;
        for (int i = 10; i > 0; i--) {
            System.out.print(space_sum(a));
            a +=2;
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("________________________________________");
        System.out.println();

        a = 0;
        for (int i = 9; i >= 0; i--) {
            System.out.print(space_sum(a));
            a += 2;
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
                if (j == 0) {
                    for (int e = 1; e < i + 1; e++) {
                        System.out.print(e + " ");
                        if (e == i) {
                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}

package hm;

public class Hm3_pyramids {
    /*
    Задача №1

            0  1  2  3  4  5  6  7  8  9
            0  1  2  3  4  5  6  7  8
            0  1  2  3  4  5  6  7
            0  1  2  3  4  5  6
            0  1  2  3  4  5
            0  1  2  3  4
            0  1  2  3
            0  1  2
            0  1
            0


    Задача №2

            0  1  2  3  4  5  6  7  8  9
            0  1  2  3  4  5  6  7  8
            0  1  2  3  4  5  6  7
            0  1  2  3  4  5  6
            0  1  2  3  4  5
            0  1  2  3  4
            0  1  2  3
            0  1  2
            0  1
            0


    Задача №3

            9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
            8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
            6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
            4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
            2 1 0 1 2
            1 0 1
*/
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

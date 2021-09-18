package hm;

public class Hw1_2 {
    public static void main (String[] args) {
        byte a = 10;
        byte b = 21;
        short s = 100;
        short t = 100;
        int i = 1000000;
        long phoneNumber = 3807282333L;
        float f = 100.101f;
        double d = 1000.10000001;
        String myNameInSlack = "Andrey994";
        int sum = a + b;
        int product = s * t;
        int quotient = i / 50;
        double reminder = f / 100;
        double sum1 = i + d;
        System.out.println(b % 2);
        System.out.println("___________________-");
        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(reminder);
        System.out.println(sum1);

        System.out.println("My name " + myNameInSlack + " and my phone number " + phoneNumber);

        int yob = 1090;
        int our_time = 2021;
        System.out.println("“Если человек родился в " + yob + " году, то его возраст "
                + (our_time - yob) + "год”. ");



    }

}

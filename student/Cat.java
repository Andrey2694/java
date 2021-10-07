package student;

public class Cat {
    String name;
    int age;
    String color;
    int price;
    String sex;
    boolean balls;

    public void setSex () {
        int random = (int)Math.round(Math.random() * 2);
        if (random == 2) {
            sex = "girl";
        }else {
            sex = "man";
            balls = true;
        }
    }

    public Cat(String name, int age, String color, int price) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.price = price;
        setSex();
    }
}

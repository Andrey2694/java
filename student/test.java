package student;

public class test {

    public static void main(String[] args) {
        Person person = new Person("Valera");
        person.earnMoney(person);
        person.earnMoney(person);
        person.buyCat(new Cat("Murzik",15,"red",999));
        System.out.println(person.cat.balls);
    }
}

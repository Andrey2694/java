package hm;

public class Person {
    String name;
    int age;
    String sex;

    Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getName() {
        if (sex.equals("man")) {
           return sex = "Mr. " + sex;
        }
        if (sex.equals("women")) {
            return sex = "Mrs. " + sex;
        }
        return "error";
    }
}

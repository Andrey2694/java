package hm;


/* Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
 * метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
 */

public class Person {
    String name;
    int age;
    String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName() {
        if (sex.equals("M")) {
            return sex = "Mr. " + sex;
        }
        if (sex.equals("W")) {
            return sex = "Mrs. " + sex;
        }
        return "error";
    }
}

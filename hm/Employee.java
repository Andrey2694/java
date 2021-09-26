package hm;

public class Employee {
    String name;
    int age;
    String sex;
    int salary;

    Employee() {}

    Employee(Person person,int salary) {
        this.name = person.name;
        this.age = person.age;
        this.sex = person.sex;
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        if (this.name.equals(employee.name)) {
            return true;
        }

        return false;
    }

}

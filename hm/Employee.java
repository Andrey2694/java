package hm;
        /*Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
         *Класс должен иметь метод isSameName(Employee employee) который возвращает true,
         *если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
         *одинаковое имя.
         */
public class Employee {
    Person person;
    int salary;

    public Employee() {
    }

    public Employee(Person person, int salary) {
        this.person = person;
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        if (person.name.equals(employee.person.name)) {
            return true;
        }

        return false;
    }

}

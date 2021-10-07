package hm;

        /*Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
         *метод должен возвращать сумму зарплат всех сотрудников из массива
         *переданного в качестве аргумента вызова метода.
         */
public class Salary {

    public int getSum(Employee[] employeeArray) {
        int sum = 0;
        if (employeeArray == null || employeeArray.length == 0) {
            return sum;
        }

        for (Employee emp : employeeArray) {
            sum += emp.salary;
        }
        return sum;
    }
}

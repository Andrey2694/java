package hm;

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

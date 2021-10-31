package hm.hm15;

import java.util.Locale;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private int salaryForDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalaryForDay() {
        return salaryForDay;
    }

    public void setSalaryForDay(int salaryForDay) {
        this.salaryForDay = salaryForDay;
    }

    public int getSalary(Month[] array) {
        int salary = 0;
        for (Month ar : array) {
            salary += salaryForDay * ar.getCountWorkDays();
        }
        return salary;
    }
    public int getSalary(Month[] array,String month) {
        int salary = 0;
        for (Month ar : array) {
            if (ar.getMonthName().toLowerCase(Locale.ROOT).equals(month)) {
                salary += salaryForDay * ar.getCountWorkDays();
            }
        }
        return salary;
    }

}

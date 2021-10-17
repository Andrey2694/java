package hm.hm15;

import java.util.Locale;

public class Manager extends Employee {
    private int countOfWorkers;

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    @Override
    public int getSalary(Month[] array) {
        int salary = 0;
        for (Month ar : array) {
            salary += getSalaryForDay() * ar.getCountWorkDays();
        }
        int extraMoney = salary / 100 * countOfWorkers;

        return salary + extraMoney;
    }

    @Override
    public int getSalary(Month[] array, String month) {
        int salary = 0;
        for (Month ar : array) {
            if (ar.getMonthName().toLowerCase(Locale.ROOT).equals(month)) {
                salary += getSalaryForDay() * ar.getCountWorkDays();
            }
        }
        int extraMoney = salary / 100 * countOfWorkers;

        return salary + extraMoney;
    }
}

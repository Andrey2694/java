package hm.hm15;

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
        int salary = super.getSalary(array);
        return salary + (salary / 100 * countOfWorkers);
    }

    @Override
    public int getSalary(Month[] array, String month) {
        int salary = super.getSalary(array,month);
        return salary + (salary / 100 * countOfWorkers);
    }
}

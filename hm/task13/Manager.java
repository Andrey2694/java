package hm.task13;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 3);
        } else return getBaseSalary();
    }
}

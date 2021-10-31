package hm.hm14;

public class Director extends Manager {
    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }else return getBaseSalary();
    }
}

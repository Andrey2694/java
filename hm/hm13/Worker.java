package hm.hm13;

public class Worker extends Employee {

    @Override
    public int getSalary() {
        return getBaseSalary();
    }

}

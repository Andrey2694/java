package hm.hm15;

public class main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        m.setCountOfWorkers(1);
        m.setSalaryForDay(1);
        e.setSalaryForDay(1);
        Month.MonthHelper.monthsInit();
        System.out.println(e.getSalary(Month.MonthHelper.getArrayMonths()));
        System.out.println(e.getSalary(Month.MonthHelper.getArrayMonths(),"january"));
        System.out.println(m.getSalary(Month.MonthHelper.getArrayMonths()));
        System.out.println(m.getSalary(Month.MonthHelper.getArrayMonths(),"january"));

    }
}

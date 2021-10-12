package hm.task13;

public class Methods extends Employee {
    //    поиск сотрудника в массиве по его имени
    public static boolean findByName(Employee[] arr, String name) {
        for (Employee s : arr) {
            if (s.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static boolean findByString(Employee[] arr, String str) {
        for (Employee s : arr) {
            if (s.getName().contains(str)) {
                return true;
            }
        }
        return false;
    }

    //    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int sumSalary(Employee[] arr) {
        int sum = 0;
        for (Employee a : arr) {
            sum += a.getSalary();
        }
        return sum;
    }

    //    поиск наименьшей зарплаты в массиве
    public static int minSalary(Employee[] arr) {
        int min = arr[0].getSalary();
        for (Employee a : arr) {
            if (min > a.getSalary()) {
                min = a.getSalary();
            }
        }
        return min;
    }

    //    поиск наибольшей зарплаты в массиве
    public static int maxSalary(Employee[] arr) {
        int max = arr[0].getSalary();
        for (Employee a : arr) {
            if (max < a.getSalary()) {
                max = a.getSalary();
            }
        }
        return max;
    }

    //    поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minNumberOfSubordinates(Manager[] arr) {
        int min = arr[0].getNumberOfSubordinates();
        for (Manager a : arr) {
            if (min > a.getNumberOfSubordinates()) {
                min = a.getNumberOfSubordinates();
            }
        }
        return min;
    }

    //    поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxNumberOfSubordinates(Manager[] arr) {
        int max = arr[0].getNumberOfSubordinates();
        for (Manager a : arr) {
            if (max < a.getNumberOfSubordinates()) {
                max = a.getNumberOfSubordinates();
            }
        }
        return max;
    }

    //    поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static int maxSalaryIncrease(Manager[] arr) {
        int max = 0;
        for (Manager a : arr) {
            int increase = a.getSalary() - a.getBaseSalary();
            if (max < increase) {
                max = increase;
            }
        }
        return max;
    }

    //    поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static int minSalaryIncrease(Manager[] arr) {
        int min = 0;
        for (Manager a : arr) {
            int increase = a.getSalary() - a.getBaseSalary();
            if (min > increase) {
                min = increase;
            }
        }
        return min;
    }
}

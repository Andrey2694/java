package hm.hm15;

public class Month {
    private String monthName;
    private int countDays;
    private int countWorkDays;

    public String getMonthName() {
        return monthName;
    }

    public int getCountDays() {
        return countDays;
    }

    public int getCountWorkDays() {
        return countWorkDays;
    }

    public Month(String monthName, int countDays, int countWorkDays) {
        this.monthName = monthName;
        this.countDays = countDays;
        this.countWorkDays = countWorkDays;
    }


    public static class MonthHelper {
        private final static Month[] ARRAY_MONTHS = new Month[12];

        public static Month[] getArrayMonths () {
            return ARRAY_MONTHS;
        }
        public static void monthsInit() {
            ARRAY_MONTHS[0] = new Month("january", 31, 21);
            ARRAY_MONTHS[1] = new Month("february", 28, 22);
            ARRAY_MONTHS[2] = new Month("march", 31, 24);
            ARRAY_MONTHS[3] = new Month("april", 30, 24);
            ARRAY_MONTHS[4] = new Month("may", 31, 23);
            ARRAY_MONTHS[5] = new Month("june", 30, 24);
            ARRAY_MONTHS[6] = new Month("july", 31, 25);
            ARRAY_MONTHS[7] = new Month("august", 30, 23);
            ARRAY_MONTHS[8] = new Month("september", 31, 24);
            ARRAY_MONTHS[9] = new Month("october", 30, 23);
            ARRAY_MONTHS[10] = new Month("november", 31, 25);
            ARRAY_MONTHS[11] = new Month("december", 31, 22);
        }

    }
}

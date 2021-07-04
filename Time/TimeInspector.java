package by.epam.Time;

;

public class TimeInspector {

    public static void main(String[] args) {
        Time t = new Time(24, 50, 40);
        Time t2 = new Time(6, 10, 15);

        System.out.println("Initial time " + t);

        int hh = 7;
        int mm = 13;
        int ss = 12;

        t.setHour(hh);
        t.setMinute(mm);
        t.setSecond(ss);
        System.out.println("Set time " + t);

        t.add(10, 15, 13);
        System.out.println("Total time  " + t);
    }
}

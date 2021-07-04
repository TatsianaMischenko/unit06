package by.epam.Counter;

import by.epam.Counter.Counter;

public class CounterInspector {


    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter = new Counter(0, 30, 0, 5);

        System.out.println(counter.getInitCount());
        counter.increase();
        System.out.println(counter.getCount());
        counter.setStep(3);
        counter.decrease();
        System.out.println("Current count: " + counter.getCount());
    }

}

package by.epam.Time;

//Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
// с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается
// в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        if (isValid(hour, 24)) {
            this.hour = hour;
        } else
            this.hour = 0;

        if (isValid(minute, 60)) {
            this.minute = minute;
        } else
            this.minute = 0;

        if (isValid(second, 60)) {
            this.second = second;
        } else
            this.second = 0;
    }

    private boolean isValid(int time, int maxValue) {
        return (time >= 0 && time < maxValue);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (isValid(hour, 24)) {
            this.hour = hour;
        } else
            this.hour = 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (isValid(minute, 60)) {
            this.minute = minute;
        } else
            this.minute = 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (isValid(second, 60)) {
            this.second = second;
        } else
            this.second = 0;
    }

    public void add(int h, int m, int s) {
        long currentTimeInSecond;
        long addTimeInSecond;

        currentTimeInSecond = hour * 60 * 60 + minute * 60 + second;
        addTimeInSecond = h * 60 * 60 + m * 60 + s;

        long totalTime = currentTimeInSecond + addTimeInSecond;
//      Время ограничено рамками 24 часов
        hour = (int) totalTime / (60 * 60) % 24;
        minute = (int) totalTime / 60 % 60;
        second = (int) totalTime % 60;

    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

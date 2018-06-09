package lec06.ex3;

public class Time24 {
    int hour;
    int minute;
    int second;

    public Time24(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        rationalize();
    }

    private void rationalize() {
        minute += second / 60;
        second %= 60;
        hour += minute / 60;
        minute %= 60;
        hour %= 24;
    }

    public Time24() {
        this(0, 0, 0);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toAMPMString() {
        if (hour > 12)
            return String.format("%02d:%02d:%02dPM", hour - 12, minute, second);
        else
            return String.format("%02d:%02d:%02dAM", hour, minute, second);
    }

    public Time24 addSeconds(int seconds) {
        return new Time24(hour, minute, second + seconds);
    }

    public Time24 add(Time24 that) {
        return new Time24(this.hour + that.hour, this.minute + that.minute, this.second + that.second);
    }

    public void ticToc() {
        ++second;
        rationalize();
    }
}

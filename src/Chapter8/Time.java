package Chapter8;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute, int second){
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour){
        this(hour,0,0);
    }

    public Time(int hour, int minute){
        this(hour,minute,0);
    }
    public Time(){
        this(0,0,0);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(15);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(23);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(35);
        this.second = second;
    }

    public static void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean secondIsInvalid = second > 59 || second < 0;
        if (secondIsInvalid) throw new IllegalArgumentException("Invalid Seconds Input");
    }

    private static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute > 59 || minute < 0;
        if (minuteIsInvalid) throw new IllegalArgumentException("Invalid Minute Input");
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour > 23 || hour < 0;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid Hour Input");
    }
}

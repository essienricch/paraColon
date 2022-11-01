package Chapter3;

public class Clock {
    private int Hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        if (hour > 0 && hour <= 23){
            this.Hour = hour;
        }else {
            this.Hour = 00;
        }

        if (minute > 0 && minute <= 59){
            this.minute = minute;
        }else {
            this.minute = 00;
        }

        if (second > 00 && second <= 59){
            this.second = second;
        }else {
            this.second = 00;
        }
    }

    public void setHour(int hour){
        if (hour > 0 && hour <= 23){
            this.Hour = hour;
        }else {
            this.Hour = 0;
        }
    }
    public int getHour(){
        return Hour;
    }
    public void setMinute(int minute){
        if (minute > 0 && minute <= 59){
            this.minute = minute;
        }else {
            this.minute = 0;
        }
    }
    public int getMinute(){
        return minute;
    }

    public void setSecond(int second) {
        if (second > 0 && second <= 59){
            this.second = second;
        }else {
            this.second = 0;
        }
    }

    public int getSecond() {
        return second;
    }
    public void displayTime(){
        System.out.printf("%s%02d:%02d:%02d","The time is: ",getHour(),getMinute(),getSecond());
    }
}

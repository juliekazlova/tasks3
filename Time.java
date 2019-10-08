package by.epam.j_lab.unit3.avolzak;

import java.util.Objects;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time(){
        hour=0;
        minute=0;
        second=0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                minute == time.minute &&
                second == time.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(this.hour+hour>0){
            this.hour = (this.hour+hour)%24;
        }
        else {
            this.hour += hour;
            while (this.hour < 0) {
                this.hour += 24;
            }
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(this.minute+minute>0){
            this.minute = (this.minute+minute)%60;
        }
        else {
            this.minute +=minute;
            while (this.minute < 0) {
                this.minute += 60;
            }
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(this.second+second>0){
            this.second = (this.second+second)%60;
        }
        else {
            this.second +=second;
            while (this.second < 0) {
                this.second += 60;
            }
        }
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(hour).append(":").append(minute).append(":").append(second);
        return sb.toString();
    }

}

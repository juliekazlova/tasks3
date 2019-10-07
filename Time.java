package j_lab;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.second = second;
        if(hour>0&&hour<24) {
            this.hour = hour;
        }
        else this.hour=0;
        if(minute>0&&minute<60) {
            this.minute = minute;
        }
        else this.minute=0;
        if(second>0&&second<60) {
            this.second = second;
        }
        else this.second=0;
    }

    public Time(){
        hour=0;
        minute=0;
        second=0;
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

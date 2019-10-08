package by.epam.j_lab.unit3.avolzak;


public class Train {
    private String destination;
    private int id;
    private int timeHour;
    private int timeMinute;

    public Train(String destination, int id, int timeHour, int timeMinute) {
        this.destination = destination;
        this.id = id;
        if(timeHour>0&&timeHour<24) {
            this.timeHour = timeHour;
        }
        else this.timeHour=0;
        if(timeMinute>0&&timeMinute<60) {
            this.timeMinute = timeMinute;
        }
        else this.timeMinute=0;
    }

    public Train(){
        destination="NO_DESTINATION";
        id=-1;
        timeHour=0;
        timeMinute=0;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(int timeHour) {
        this.timeHour = timeHour;
    }

    public int getTimeMinute() {
        return timeMinute;
    }

    public void setTimeMinute(int timeMinute) {
        this.timeMinute = timeMinute;
    }
}

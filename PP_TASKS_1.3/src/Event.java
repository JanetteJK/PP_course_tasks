import eduni.distributions.Normal;

import javax.swing.event.DocumentEvent;

public class Event {
    //event has a type and a time
    private double time;
    eventType type;

    public Event(eventType type, double time){
        this.type = type;
        this.time = time;
    }

    public double getTime(){
        return time;
    }


    public enum eventType{
        ARRIVAL, OTHER
    }

    public eventType getEventType(){
        return this.type;
    }
}

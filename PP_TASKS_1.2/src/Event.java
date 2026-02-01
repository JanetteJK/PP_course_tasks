import java.util.ArrayList;
import java.util.List;

public class Event implements Comparable<Event> {
    private int time;
    private int eventId;
    private static int _id;
    EventType type;



    public Event(EventType type,double time){
        _id++;
        this.eventId = _id;
        this.time = (int)time;
        this.type = type;


    }

    public int getEventId(){
        return eventId;
    }

    public int getTime(){
        return time;
    }

    public int compareTo(Event e){
        return time - e.time;
    }

    public enum EventType{
        ARRIVAL, EXIT
    }

    public EventType getType(){
        return this.type;
    }


}
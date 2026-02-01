import java.util.ArrayList;
import java.util.List;

public class Event implements Comparable<Event> {
    private int time;
    private int eventId;
    private static int _id;

    public Event(double time){
        _id++;
        this.eventId = _id;
        this.time = (int )time;

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


}
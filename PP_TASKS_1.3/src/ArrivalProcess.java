import eduni.distributions.Normal;
import java.util.ArrayList;

public class ArrivalProcess {
    //Creates Arrival event with a time stamp from the generator
    //Puts the event in the event list
    //Every time an event is created a clock is moved with the amount of time the event demands
    Normal times = new Normal(30,60);


    public void createEvents(ArrayList<Event> events, Clock clock){
        double time = times.sample();
        clock.setTime(time);
        events.add(new Event(Event.eventType.ARRIVAL, time));
    }
}

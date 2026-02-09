import java.util.ArrayList;

public class Main6 {

    public static void main(String[]args){
        Clock clock = Clock.getInstance();
        ArrivalProcess arriving = new ArrivalProcess();
        ArrayList<Event> eventList = new ArrayList<>();
        ServicePoint sp = new ServicePoint();

        //how many events
        final int howMany = 10;

        for (int i = 0; i <= howMany; i++){
            arriving.createEvents(eventList, clock);
        }
        for (Event event : eventList) {
            System.out.println("Type: " + event.getEventType() + " Time: " + event.getTime());
            sp.addQueue(new Customer(), event);
            new Customer().setStartTime((long)event.getTime());
            clock.moveTime(5);
        }

        sp.removeCustomers(clock);


    }
}


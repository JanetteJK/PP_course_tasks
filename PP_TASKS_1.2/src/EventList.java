import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events;

    public EventList() {
        events = new PriorityQueue<>();
    }

    public void addEvents(Event e) {
        events.add(e);
    }

    public void removeNextEvent() {
        if (!events.isEmpty()) {
            events.poll();
            System.out.println("Removing first event!");
        } else {
            System.out.println("Unable to remove next, event list is empty");
        }
    }


    public void getEvents() {
        while (!events.isEmpty()) {
            Event e = events.poll();
            System.out.println("Event ID #" + e.getEventId() + ", event type: " + e.getType() + ", execution time: " + e.getTime() + " seconds");

            // did not print the times in order
        /* if (!events.isEmpty()) {
            events.forEach(event -> System.out.println("Event ID #" + event.getEventId() + " executing in " + event.getTime() + " seconds"));
        } else {
            System.out.println("Event list is empty");
        }

         */
        }
        System.out.println("No more events to process");
    }
}


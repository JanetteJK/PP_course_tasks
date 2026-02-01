public class Main {
    public static void generateArrivalEvents(EventList el, int howMany) {
        for (int i = 0; i < howMany; i++) {
            el.addEvents(new Event(Event.EventType.ARRIVAL, Math.random() * 10));
        }
    }

    public static void generateExitEvents(EventList el, int howMany) {
        for (int i = 0; i < howMany; i++) {
            el.addEvents(new Event(Event.EventType.EXIT, Math.random() * 10));
        }
    }

    public static void main(String[] args) {
        EventList lst = new EventList();
        generateArrivalEvents(lst, 3);
        generateExitEvents(lst, 3);
        lst.removeNextEvent();
        lst.getEvents();
        lst.removeNextEvent();

    }

}
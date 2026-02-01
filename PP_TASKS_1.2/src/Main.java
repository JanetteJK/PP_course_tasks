public class Main {
    public static void generateEvents(EventList el, int howMany) {
        for (int i = 0; i < howMany; i++){
            el.addEvents(new Event(Math.random()*10));
        }
    }
    public static void main(String[]args){
        EventList lst = new EventList();
        generateEvents(lst, 4);
        lst.removeNextEvent();
        lst.getEvents();
        lst.removeNextEvent();

    }
}

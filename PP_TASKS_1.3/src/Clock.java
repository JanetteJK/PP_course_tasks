public class Clock {
    private static Clock instance;

    private Clock(){
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    private double time = 0;
    public void setTime(double time){
        this.time = time;
    }
    public void moveTime(double time){
        this.time += time;
    }
    public double getTime(){
        return time;
    }
}

class Main{
    public static void main(String[]args) {
        Clock clock = Clock.getInstance();

        clock.setTime(20);

        System.out.println("Clock says " + clock.getTime());

    }
}

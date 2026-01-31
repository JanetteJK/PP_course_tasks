public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int _id;

    public Customer() {
        _id++;
        id = _id;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();

        c1.setStartTime(System.nanoTime());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        c1.setEndTime(System.nanoTime());
        System.out.println("Customer " + c1.getId() + " took " + c1.getTimeSpent()* (Math.pow(10, -6)) + " ms");

        c2.setStartTime(System.nanoTime());
        c2.setEndTime(System.nanoTime());
        System.out.println("Customer " + c2.getId() + " took " + c2.getTimeSpent()* (Math.pow(10, -6)) + " ms");

    }
}
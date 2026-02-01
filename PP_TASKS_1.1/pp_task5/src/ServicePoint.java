import javax.swing.plaf.TableHeaderUI;
import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> customers;
    //long sleeptime = (long)(Math.random() * 1500 + 500);
    long customersLength;
    private long meanService;

    public ServicePoint() {
        customers = new LinkedList<>();
    }

    public void addToQueue(Customer a) {
        a.setStartTime(System.nanoTime());
        customers.addFirst(a);
    }

    public Customer removeFromQueue() {
        if (customers.isEmpty()) {
            return null;
        }
        customers.getLast().setEndTime(System.nanoTime());
        return customers.removeLast();

    }

    public void serve() {
        customersLength = customers.size();
        while (!customers.isEmpty()) {
            Customer served = removeFromQueue();
            served.setServiceStart(System.nanoTime());
            long sleeptime = (long)(Math.random() * 1500 + 500);
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            served.setEndService(System.nanoTime());
            this.meanService = meanService + served.getServiceTime();
            System.out.println("Customer #" + served.getId() + " response time was " + (double)served.getOverallTime()* Math.pow(10, -9) + " seconds, and service time was " + (double)served.getServiceTime() * Math.pow(10, -6) + " seconds.");
        }
        System.out.println("Queue is empty");
        System.out.println("Mean service time was " + (this.meanService/customersLength) * Math.pow(10,-9) + " seconds");
    }
}




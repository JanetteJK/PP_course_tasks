import javax.swing.plaf.TableHeaderUI;
import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> customers;
    long sleeptime = (long) (Math.random() * 2000);

    public ServicePoint() {
        customers = new LinkedList<>();
    }

    public void addToQueue(Customer a) {
        a.setStartTime(System.nanoTime());
        customers.addFirst(a);
    }

    public Customer removeFromQueue() {
        return customers.getLast();

    }

    public void serve() {
        while (!customers.isEmpty()) {
            Customer served = removeFromQueue();
            served.setEndTime(System.nanoTime());
            served.setServiceStart(System.nanoTime());
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            served.setEndService(System.nanoTime());
            System.out.println("Customer #" + served.getId() + " response time was " + served.getOverallTime() * Math.pow(10, -9) + " seconds, and service time was " + served.getServiceTime() * Math.pow(10, -9) + " seconds.");
        }
        System.out.println("Queue is empty, closing service point");
        }
    }




import javax.swing.plaf.TableHeaderUI;
import java.util.LinkedList;

public class ServicePoint  {
    LinkedList<Customer> customers;
    long sleeptime = (long)(Math.random() * 2000);



    public ServicePoint(){
        customers = new LinkedList<>();
    }

    public void addToQueue(Customer a){
        a.setStartTime(System.nanoTime());
        customers.addFirst(a);
    }
    public Customer removeFromQueue(){
        return customers.getLast();

    }

    public void serve(){
        Customer served = removeFromQueue();
        served.setEndTime(System.nanoTime());
        served.setServiceStart(System.nanoTime());
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
        }
        served.setEndService(System.nanoTime());
        System.out.println("Customer " + served.getId() + " response time was " + served.getOverallTime() * Math.pow(10,-9) + " seconds, and service time was " + served.getServiceTime()* Math.pow(10,-9) + " seconds.");
        }


        public static void main(String[]args){
        }


    }



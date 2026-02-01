import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        LinkedList<Customer> queue = new LinkedList<Customer>();
        ArrayList<Customer> ppl = new ArrayList<>();
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        Customer c4 = new Customer();

        ppl.add(c1);
        ppl.add(c2);
        ppl.add(c3);
        ppl.add(c4);


            do {
                for (Customer c : ppl) {
                    System.out.println("Press 1 to queue customers or 2 to dequeue customers");
                    int ans = scanner.nextInt();
                    if (ans == 1) {
                        c.setStartTime(System.nanoTime());
                        queue.addFirst(c);
                        System.out.println("added customer to queue, queue length is " + queue.size() );
                    }
                    if (ans == 2 && !queue.isEmpty()) {

                        Customer v = (Customer) queue.getLast();
                        v.setEndTime(System.nanoTime());
                        queue.removeLast();
                        System.out.println("Customer " + v.getId() + " spent " + v.getTimeSpent() * (Math.pow(10, -6)) + " ms in the queue\n");
                    }

                }


        }while (!queue.isEmpty());
        System.out.println("The queue is empty");
    }
}
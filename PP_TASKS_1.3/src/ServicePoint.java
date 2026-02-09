import java.util.*;

public class ServicePoint {
    public Queue<Customer> queue = new PriorityQueue<>();

    public void addQueue(Customer customer, Event event) {
        queue.add(customer);
        customer.setStartTime((long) event.getTime());
    }

    public Queue<Customer> getQueue() {
        return queue;
    }

    public void removeCustomers(Clock clock) {
        while (!queue.isEmpty()) {
            queue.peek().setEndTime((long)clock.getTime());
            System.out.println("Removing customer: " + queue.peek().getId() + " Spent time in the queue " + queue.peek().getTimeSpent());
            queue.poll();
        }
    }
}
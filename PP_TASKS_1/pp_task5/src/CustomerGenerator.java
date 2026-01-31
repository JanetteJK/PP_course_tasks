public class CustomerGenerator {
    public static void generate(ServicePoint sp, int count) {
        for (int i = 0; i < count; i++) {
            sp.addToQueue(new Customer());
        }
        System.out.println(count + " customers added to the queue");
        sp.serve();
    }
}


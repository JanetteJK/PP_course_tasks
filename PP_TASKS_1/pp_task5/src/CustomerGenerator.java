public class CustomerGenerator {

    public CustomerGenerator(ServicePoint servicepoint) {
       for (int i = 0; i < Math.random()*10; i++){
           Customer c = new Customer();
           servicepoint.addToQueue(c);
       }
        }



    }


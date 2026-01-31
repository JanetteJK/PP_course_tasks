public class Main {
    public static void main(String[]args){
        ServicePoint shop = new ServicePoint();
        CustomerGenerator.generate(shop, 10);
    }
}

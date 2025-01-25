public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Rice", 39000);
        Product product2 = new Product("Meat", 3000);
        Product product3 = new Product("Fish", 1500);

        Customer favouriteCustomer = new Customer("Georgee Flash");

        Order order = new Order();

        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        System.out.println(order.calculateTotal()); // 43500.0
    }
}
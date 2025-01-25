public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Rice", 39000);
        Product product2 = new Product("Meat", 3000);
        Product product3 = new Product("Fish", 1500);

        // Create a customer
        Customer favouriteCustomer = new Customer("Georgee Flash");

        // Create an order and add products
        Order order = new Order(favouriteCustomer);

        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        // Display the order details
        order.displayOrder();
    }
}
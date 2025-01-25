import java.util.ArrayList;

// Class representing an order
class Order {
    Customer customer;
    ArrayList<Product> products = new ArrayList<>(); // List of products in the order

    public  Order(Customer customer) {
        this.customer = customer;
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.name + " added to the order.");
    }

    // Calculate the total cost of the order
    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.price;
        }
        return total;
    }

    // Display the order details
    public  void displayOrder() {
        System.out.println("Order for " + customer.name + ":");

        for (Product product : products) {
            System.out.println("- " + product);
        }

        System.out.println("Total Cost: XAF" + calculateTotal());
    }
}

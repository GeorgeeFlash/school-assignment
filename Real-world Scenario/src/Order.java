import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
}

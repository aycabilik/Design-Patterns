package lab2;


import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> products;
    Shopping shopping;

    public Cart(Shopping shopping) {
        this.products = new ArrayList<Product>();
        this.shopping = shopping;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        return shopping.calculatePrice(products);
    }
}

package productBilder.productID.product;

import java.util.ArrayList;
import java.util.List;

public class Laptop extends Product {

    List<Product> laptopList = new ArrayList<>();

    public Laptop(String nameProduct, String brand, int price, String description, int article) {
        super(nameProduct, brand, price, description, article);
    }

    public Laptop() {

    }
}

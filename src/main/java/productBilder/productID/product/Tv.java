package productBilder.productID.product;

import java.util.ArrayList;
import java.util.List;

public class Tv extends Product{

    List<Product> tvList = new ArrayList<>();

    public Tv(String nameProduct, String brand, int price, String description, int article) {
        super(nameProduct, brand, price, description, article);
    }

    public Tv() {


    }
}

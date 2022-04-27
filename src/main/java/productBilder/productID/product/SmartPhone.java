package productBilder.productID.product;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone extends Product{

    List<Product> smartPhoneList = new ArrayList<>();

    public SmartPhone(String nameProduct, String brand, int price, String description, int article) {
        super(nameProduct, brand, price, description, article);
    }

    public SmartPhone() {


    }
}

package productBilder.productID.productSrevice;

import productBilder.productID.builders.LaptopBuilder;
import productBilder.productID.builders.SmartPhoneBuilder;
import productBilder.productID.builders.TVBuilder;
import productBilder.productID.product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMapService {

    private static Map<String, List<Product>> products = new HashMap<>();

    public static synchronized Map<String, List<Product>> populateProduct(){

        products.put("Ноутбук", new LaptopBuilder().createProduct());
        products.put("Телефон", new SmartPhoneBuilder().createProduct());
        products.put("Телевизор", new TVBuilder().createProduct());

        return products;
    }

    public static synchronized List<Product> get(String name) {
        return products.get(name);
    }

    public static synchronized void productAdd(){

    }




}

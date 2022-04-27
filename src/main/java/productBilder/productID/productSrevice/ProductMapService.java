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

    public static Map<String, List<Product>> populateProduct(){

        products.put("Laptop", new LaptopBuilder().createProduct());
        products.put("SmartPhone", new SmartPhoneBuilder().createProduct());
        products.put("Tv", new TVBuilder().createProduct());

        return products;
    }

    public static List<Product> get(String name) {
        return products.get(name);
    }




}

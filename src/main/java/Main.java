import productBilder.productID.product.Laptop;
import productBilder.productID.product.Product;
import productBilder.productID.product.SmartPhone;
import productBilder.productID.product.Tv;
import productBilder.productID.productSrevice.ProductMapService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, List<Product>> products = ProductMapService.populateProduct();
        List<Product> foundProduct = products.get("Ноутбук");

        System.out.println(products.keySet());
        System.out.println(foundProduct);







    }
}

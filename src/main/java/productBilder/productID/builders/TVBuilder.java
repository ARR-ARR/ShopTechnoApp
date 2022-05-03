package productBilder.productID.builders;

import productBilder.productID.product.Product;
import productBilder.productID.product.Tv;
import java.util.ArrayList;
import java.util.List;


public class TVBuilder implements BuilderProduct {

    private List<Product> tvList = new ArrayList<>();

    @Override
    public List<Product> createProduct() {

        Tv tvSamsung = new Tv("Телевизор", "Samsung", 14999.00d, "80cm, Черный, LED");
        Tv tvCandy = new Tv("Телевизор", "Candy", 15999.00d, "81cm, Белый, LED");
        Tv tvBbk = new Tv("Телевизор", "BBK", 21999.00d, "109cm, Черный, LED");
        Tv tvPhilips = new Tv("Телевизор", "Philips", 23999.00d, "80cm, Черный, LED");
        Tv tvSony = new Tv("Телевизор", "Sony", 33999.00d, "109cm, Черный, LED");

        tvList.add(tvSamsung);
        tvList.add(tvCandy);
        tvList.add(tvBbk);
        tvList.add(tvPhilips);
        tvList.add(tvSony);

        return tvList;
    }
}

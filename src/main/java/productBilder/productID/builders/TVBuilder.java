package productBilder.productID.builders;

import productBilder.productID.product.Product;
import productBilder.productID.product.Tv;
import java.util.ArrayList;
import java.util.List;


public class TVBuilder implements BuilderProduct {

    private List<Product> tvList = new ArrayList<>();

    @Override
    public List<Product> createProduct() {

        Tv tvSamsung = new Tv("Телевизор", "Samsung", 14999, "80cm, Черный, LED",
                1121);
        Tv tvCandy = new Tv("Телевизор", "Candy", 15999, "81cm, Белый, LED",
                1122);
        Tv tvBbk = new Tv("Телевизор", "BBK", 21999, "109cm, Черный, LED",
                1123);
        Tv tvPhilips = new Tv("Телевизор", "Philips", 23999, "80cm, Черный, LED",
                1124);
        Tv tvSony = new Tv("Телевизор", "Sony", 33999, "109cm, Черный, LED",
                1125);

        tvList.add(tvSamsung);
        tvList.add(tvCandy);
        tvList.add(tvBbk);
        tvList.add(tvPhilips);
        tvList.add(tvSony);

        return tvList;
    }
}

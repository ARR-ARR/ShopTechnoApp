package productBilder.productID.builders;

import  productBilder.productID.product.Product;
import productBilder.productID.product.SmartPhone;
import java.util.ArrayList;
import java.util.List;


public class SmartPhoneBuilder implements BuilderProduct {

    private List<Product> smartPhoneList = new ArrayList<>();

    @Override
    public List<Product> createProduct() {

        SmartPhone samsung = new SmartPhone("Телефон", "Samsung", 14999,
                "Модель-Galaxy, 16ГБ", 1111);
        SmartPhone dexp440 = new SmartPhone("Телефон", "DEXP440", 3199,
                "Модель- A440, 8ГБ, розовый", 1112);
        SmartPhone dexpG450 = new SmartPhone("Телефон", "DEXP", 3199,
                "Модель- G450, 8ГБ, серый", 1113);
        SmartPhone bq = new SmartPhone("Телефон", "BQ", 3999,
                "Модель- 4030G, 16ГБ, черный, камера 2Мп", 1114);
        SmartPhone itelA17 = new SmartPhone("Телефон", "Itel", 4199,
                "Модель- A17, 16ГБ, голубой, камера 5Мп", 1115);

        smartPhoneList.add(samsung);
        smartPhoneList.add(dexp440);
        smartPhoneList.add(dexpG450);
        smartPhoneList.add(bq);
        smartPhoneList.add(itelA17);

        return smartPhoneList;
    }
}

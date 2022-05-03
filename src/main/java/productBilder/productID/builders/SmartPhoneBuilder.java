package productBilder.productID.builders;

import  productBilder.productID.product.Product;
import productBilder.productID.product.SmartPhone;
import java.util.ArrayList;
import java.util.List;


public class SmartPhoneBuilder implements BuilderProduct {

    private List<Product> smartPhoneList = new ArrayList<>();

    @Override
    public List<Product> createProduct() {

        SmartPhone samsung = new SmartPhone("Телефон", "Samsung", 14999.00d,
                "Модель-Galaxy, 16ГБ");
        SmartPhone dexp440 = new SmartPhone("Телефон", "DEXP440", 3199.00d,
                "Модель- A440, 8ГБ, розовый");
        SmartPhone dexpG450 = new SmartPhone("Телефон", "DEXP", 3199.00d,
                "Модель- G450, 8ГБ, серый");
        SmartPhone bq = new SmartPhone("Телефон", "BQ", 3999.00d,
                "Модель- 4030G, 16ГБ, черный, камера 2Мп");
        SmartPhone itelA17 = new SmartPhone("Телефон", "Itel", 4199.00d,
                "Модель- A17, 16ГБ, голубой, камера 5Мп");

        smartPhoneList.add(samsung);
        smartPhoneList.add(dexp440);
        smartPhoneList.add(dexpG450);
        smartPhoneList.add(bq);
        smartPhoneList.add(itelA17);

        return smartPhoneList;
    }
}

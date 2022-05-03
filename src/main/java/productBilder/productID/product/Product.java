package productBilder.productID.product;

public abstract class Product {
    private String nameProduct;
    private String brand;
    private double price;
    private String description;

    public Product(String nameProduct, String brand, double price, String description) {
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.price = price;
        this.description = description;


    }
    public Product(){

    }



    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }
        @Override
    public String toString() {
        return
                "nameProduct/" + nameProduct +
                        " brand/" + brand +
                        " price/" + price +
                        " description/" + description + "\n";
    }
}

package productBilder.productID.product;

public abstract class Product {
    private String nameProduct;
    private String brand;
    private int price;
    private String description;
    private int article;
    private int quantity;

    public Product(String nameProduct, String brand, int price, String description,int article) {
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.article = article;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return
                "nameProduct/" + nameProduct +
                        " brand/" + brand +
                        " price/" + price +
                        " description/" + description + " article/" + article + "\n";
    }
}

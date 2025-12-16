package step2;

public class Product {

    private String name;
    private int price;
    private String descriprtion;
    private int quantity;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescriprtion() {
        return descriprtion;
    }

    public int getQuantity() {
        return quantity;
    }


    public Product(String name, int price, String descriprtion, int quantity) {
        this.name = name;
        this.price = price;
        this.descriprtion = descriprtion;
        this.quantity = quantity;
    }
}

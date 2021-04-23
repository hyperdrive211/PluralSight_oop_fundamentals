/**
 * Created By Jonathon on 20/04/2021
 * Update Comments About Program Here
 **/
public class Product {
    private final String name;
    private int price;
    private int discount;
    private ProductType type;
    private int weight;

    public Product(String name, int price, ProductType type, int weight){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        int shippingCost;
        if(type == ProductType.PHYSICAL){
            shippingCost = weight * Catalogue.SHIPPING_COST;
        } else {
            shippingCost = 0;
        }
        return (int) (price * (100 - discount) / 100.0) + shippingCost;
    }

    @Override
    public String toString() {
        return String.format("Product{\nname: %s\nprice: %d\ntype: %s\n}",
                name, price, type );
    }
}
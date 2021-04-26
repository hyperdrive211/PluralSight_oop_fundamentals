/**
 * Created By Jonathon on 23/04/2021
 * Update Comments About Program Here
 **/
public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product,int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public LineItem(LineItem li){
        this(li.product, li.quantity);
    }

    public Product getProduct() {
        return product;
    }

    public int getPrice(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("\n\tLine Item{ \n product: %s \n quantity: %d \n}", product.toString(), quantity);
    }
}

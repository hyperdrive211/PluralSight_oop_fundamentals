/**
 * Created By Jonathon on 22/04/2021
 * Update Comments About Program Here
 **/
public class Order {
    private Customer customer;
    private ShoppingCart cart;
    private Payment payment;

    public Order (Customer customer, ShoppingCart cart, Payment payment){
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "\ncustomer= "+customer +
                "\ncart= "+ cart+
                "\npayment= "+payment+"\n}";
    }
}

import java.util.Optional;

/**
 * Created By Jonathon on 20/04/2021
 * Update Comments About Program Here
 **/
public class Customer {
    private final String name;
    private CreditCard creditCard;

    public Customer (String name, long ccNumber){
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }

    public Optional<Order> checkOut(ShoppingCart cart) {
        Optional<Payment> payment = creditCard.mkPayment(cart.getTotalCost());
        return payment.map(value -> new Order(this, cart, value));
    }

    @Override
    public String toString() {
        return "Customer { name: "+name+",\nCreditCard "+creditCard+"\n, }";
    }
}

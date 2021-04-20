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

}

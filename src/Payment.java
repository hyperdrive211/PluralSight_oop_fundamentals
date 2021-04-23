import java.util.UUID;

/**
 * Created By Jonathon on 23/04/2021
 * Update Comments About Program Here
 **/
public class Payment {
    private CreditCard creditCard;
    private int value;
    private UUID uuid;

    public Payment(CreditCard creditCard, int value, UUID uuid){
        this.creditCard = creditCard;
        this.value = value;
        this.uuid = uuid;
    }

    
}

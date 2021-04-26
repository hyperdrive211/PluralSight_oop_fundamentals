/**
 * Created By Jonathon on 26/04/2021
 * Update Comments About Program Here
 **/
public class BusinessCustomer extends Customer {

    public enum BusinessSize{
        SMALL,
        MEDIUM,
        LARGE
    }

    private BusinessSize size;

    public BusinessCustomer(String name, long ccNumber, BusinessSize size){
        super(name, ccNumber);
        this.size = size;
    }

    @Override
    public int calculateDiscount() {
        switch(size){
            case SMALL:
                return 5;
            case MEDIUM:
                return 15;
            case LARGE:
                return 20;
            default:
                throw new AssertionError("Unknown size type " + this);
        }
    }
}

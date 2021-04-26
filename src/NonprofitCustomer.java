/**
 * Created By Jonathon on 26/04/2021
 * Update Comments About Program Here
 **/
public class NonprofitCustomer extends Customer {

    public NonprofitCustomer(String name, long ccNumber){
        super(name, ccNumber);
    }

    @Override
    public int calculateDiscount() {
        return 15;
    }


}

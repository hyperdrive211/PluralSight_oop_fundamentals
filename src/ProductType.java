/**
 * Created By Jonathon on 23/04/2021
 * Update Comments About Program Here
 **/
enum ProductType {
    DIGITAL(0),
    PHYSICAL(Catalogue.SHIPPING_COST);
    private final int shippingRate;

    ProductType(int shippingRate){
        this.shippingRate = shippingRate;
    }

    public int getShippingCost(int weight){
        return shippingRate * weight;
    }
}

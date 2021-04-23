/**
 * Created By Jonathon on 20/04/2021
 * Update Comments About Program Here
 **/
public class Demo {
    public static void main(String [] args){
    ShoppingCart cart = new ShoppingCart();
    Product toothbrush = new Product("Electric Toothbrush", 3550);
    Product babyAlarm = new Product("Baby Alarm", 4999);

    cart.addProduct(toothbrush);
    cart.addProduct(babyAlarm);
    System.out.println(cart);
    System.out.println("Total cost of the cart: "+cart.getTotalCost());
    }

}

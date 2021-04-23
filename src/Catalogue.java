import java.util.Map;

/**
 * Created By Jonathon on 23/04/2021
 * Update Comments About Program Here
 **/
public class Catalogue {

    public final static int SHIPPING_COST = 5;
    private static Map<String, Product> productMap =Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3000, ProductType.PHYSICAL, 400),
            "Baby Alarm", new Product("Baby Alarm", 5000, ProductType.PHYSICAL, 1000),
            "War and Peace (e-book)", new Product("War and Peace (e-book)", 1000, ProductType.DIGITAL, -1)
            );
}

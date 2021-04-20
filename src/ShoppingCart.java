import java.util.ArrayList;
import java.util.List;

/**
 * Created By Jonathon on 20/04/2021
 * Update Comments About Program Here
 **/
public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public int getTotalCost(){
        return products.stream().mapToInt(Product::getPrice).sum(); 
    }
}

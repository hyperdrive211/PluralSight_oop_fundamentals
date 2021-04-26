import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * Created By Jonathon on 20/04/2021
 * Update Comments About Program Here
 **/
public class ShoppingCart {
    private List<LineItem> lineItems = new ArrayList<>();

    public void addProduct(LineItem lineItem){
        lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems(){
        return lineItems.stream().map(LineItem::new).collect(Collectors.toList());
    }

    public int getTotalCost(){
        return lineItems.stream().mapToInt(LineItem::getPrice).sum();
    }
}

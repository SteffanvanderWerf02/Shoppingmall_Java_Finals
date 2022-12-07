import java.util.ArrayList;
import java.util.HashSet;

public abstract class Store implements Secureable {

    private HashSet<Commerce> comerces;
    private String location;
    private Customer[] occupancy;
    private ArrayList<Order> orders;

    public Order createOrder() {
        return null;
    }

}
public class ProductStore extends Store {

    private int occupancyAmount;

    /**
     * @return
     */
    @Override
    public boolean isSecure() {
        return false;
    }
}
public class Restaurant extends Store {

    private double standardTip;

    private int occupancyAmount;

    /**
     * @return
     */
    @Override
    public boolean isSecure() {
        return false;
    }
}
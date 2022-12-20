public class Parkinglot implements Secureable{

    private ParkingSpace[] parkedCars;

    public boolean parkCar() {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean isSecure() {
        return false;
    }
}
package lesson_03.models.people;
import lesson_03.interfaces.IDrive;
import lesson_03.models.infrastructure.Order;
import lesson_03.models.vehicles.Vehicle;

public class Driver extends Person implements IDrive {

    private Double rating;
    private Vehicle vehicle;

    public Driver(Long id, String firstName, String lastName, String phoneNumber,
                  Double rating, Vehicle vehicle) {
        super(id, firstName, lastName, phoneNumber);
        this.rating = rating;
        this.vehicle = vehicle;
    }

    @Override
    public void startDriving(Order order) throws Exception {
        if (order == null) {
            throw new Exception("Order cannot be null");
        }
        System.out.println("Driver " + getFirstName() + " started trip to " +
                order.getDestination().getAddress());
    }

    @Override
    public void completeDriving(Order order) throws Exception {
        if (order == null) {
            throw new Exception("Order cannot be null");
        }
        System.out.println("Driver " + getFirstName() + " completed the trip");
    }


    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

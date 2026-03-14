package lesson_03.models.people;
import lesson_03.interfaces.IDrive;
import lesson_03.models.infrastructure.Order;
import lesson_03.models.vehicles.Vehicle;
import java.util.LinkedList;

public class Driver extends Employee implements IDrive {

    private Double rating;
    private Vehicle vehicle;
    // LinkedList - good for sequential trip processing (add to end, read from front)
    private LinkedList<Order> tripHistory = new LinkedList<>();

    public Driver() {
    }

    public Driver(Long id, String firstName, String lastName, String phoneNumber,
                  String employeeId, Integer yearsOfExperience, Double rating, Vehicle vehicle) {
        super(id, firstName, lastName, phoneNumber, employeeId, yearsOfExperience);
        this.rating = rating;
        this.vehicle = vehicle;
    }

    // overloading - new driver starts with default rating 5.0
    public Driver(Long id, String firstName, String lastName, String phoneNumber,
                  String employeeId, Integer yearsOfExperience, Vehicle vehicle) {
        super(id, firstName, lastName, phoneNumber, employeeId, yearsOfExperience);
        this.rating = 5.0;
        this.vehicle = vehicle;
    }

    @Override
    public String getRole() {
        return "Driver";
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
        tripHistory.addLast(order);
        System.out.println("Driver " + getFirstName() + " completed the trip");
    }

    public LinkedList<Order> getTripHistory() {
        return tripHistory;
    }

    public Order getLastTrip() {
        return tripHistory.getLast();
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

package lesson_03.models.infrastructure;
import lesson_03.models.people.Driver;
import lesson_03.models.people.Passenger;

public class Order {

    private Long id;
    private Passenger passenger;
    private Driver driver;
    private Location pickup;
    private Location destination;
    private Double price;
    private String status;


    public Order(Long newId, Passenger newPassenger, Location newPickup, Location newDestination) {
        id = newId;
        passenger = newPassenger;
        pickup = newPickup;
        destination = newDestination;
        status = "CREATED";
    }

    public void acceptOrder(Driver newDriver) throws Exception {
        if (newDriver == null) {
            throw new Exception("Driver cannot be null");
        }
        driver = newDriver;
        status = "ACCEPTED";
        System.out.println("Order #" + id + " accepted by driver " + newDriver.getFirstName());
    }

    public void cancelOrder() {
        status = "CANCELLED";
        System.out.println("Order #" + id + " cancelled");
    }

   
    public Long getId() {
        return id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger newPassenger) {
        passenger = newPassenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver newDriver) {
        driver = newDriver;
    }

    public Location getPickup() {
        return pickup;
    }

    public void setPickup(Location newPickup) {
        pickup = newPickup;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location newDestination) {
        destination = newDestination;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double newPrice) {
        price = newPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }
}

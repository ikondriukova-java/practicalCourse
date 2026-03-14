package lesson_03.models.people;
import lesson_03.interfaces.IPayable;
import lesson_03.models.infrastructure.Location;
import lesson_03.models.infrastructure.Order;
import lesson_03.models.infrastructure.Payment;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person implements IPayable {

    private List<Order> orderHistory = new ArrayList<>();

    public Passenger() {
    }

    public Passenger(Long id, String firstName, String lastName, String phoneNumber) {
        super(id, firstName, lastName, phoneNumber);
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public Payment pay(Order order) {
        Payment payment = new Payment(order.getPrice());
        payment.processPayment();
        System.out.println("Passenger " + getFirstName() + " paid $" + order.getPrice());
        return payment;
    }

    public Order requestRide(Order order) {
        return order;
    }

    // overloading 
    public void requestRide(Location pickup, Location destination) {
        System.out.println(getFirstName() + " requested a ride from " +
                pickup.getAddress() + " to " + destination.getAddress());
    }

    public void addOrderToHistory(Order order) {
        orderHistory.add(order);
        System.out.println("Order added to history. Total orders: " + orderHistory.size());
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }
}

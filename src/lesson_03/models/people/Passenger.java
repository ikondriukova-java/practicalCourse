package lesson_03.models.people;
import lesson_03.interfaces.IPayable;
import lesson_03.models.infrastructure.Order;
import lesson_03.models.infrastructure.Payment;

public class Passenger extends Person implements IPayable {

    public Passenger(Long id, String firstName, String lastName, String phoneNumber) {
        super(id, firstName, lastName, phoneNumber);
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


}

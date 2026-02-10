package lesson_03.models.infrastructure;

public class Payment {

    private Double amount;

    public Payment(Double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Payment of $" + amount + " processed");
    }
}

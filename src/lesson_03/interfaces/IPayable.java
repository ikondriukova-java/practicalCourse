package lesson_03.interfaces;

import lesson_03.models.infrastructure.Order;
import lesson_03.models.infrastructure.Payment;

public interface IPayable {
    Payment pay(Order order);
}

package lesson_03.interfaces;

import lesson_03.models.infrastructure.Order;

public interface IDrive {
    void startDriving(Order order) throws Exception;
    void completeDriving(Order order) throws Exception;
}

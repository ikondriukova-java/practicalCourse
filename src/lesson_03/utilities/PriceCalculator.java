package lesson_03.utilities;

import lesson_03.models.infrastructure.Order;
import lesson_03.models.vehicles.Vehicle;

public class PriceCalculator {

    static final double BASE_FARE = 2.5;
    static final double DEFAULT_DISTANCE_KM = 10.0;

    public static Double calculatePrice(Order order, Vehicle vehicle) throws Exception {
        if (vehicle == null) {
            throw new Exception("Vehicle cannot be null");
        }
        return BASE_FARE + (DEFAULT_DISTANCE_KM * vehicle.getPricePerKm());
    }

    // overloading - calculate price with custom distance
    public static Double calculatePrice(Order order, Vehicle vehicle, double distance) throws Exception {
        if (vehicle == null) {
            throw new Exception("Vehicle cannot be null");
        }
        return BASE_FARE + (distance * vehicle.getPricePerKm());
    }
}

package lesson_03.utilities;

import lesson_03.models.infrastructure.Order;
import lesson_03.models.vehicles.Vehicle;

public class PriceCalculator {

    public static Double calculatePrice(Order order, Vehicle vehicle) throws Exception {
        if (vehicle == null) {
            throw new Exception("Vehicle cannot be null");
        }
        Double baseFare = 2.5;
        Double distance = 10.0;
        return baseFare + (distance * vehicle.getPricePerKm());
    }
}

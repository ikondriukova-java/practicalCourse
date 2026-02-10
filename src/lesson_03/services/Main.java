package lesson_03.services;

import lesson_03.models.infrastructure.Location;
import lesson_03.models.infrastructure.Order;
import lesson_03.models.people.Driver;
import lesson_03.models.people.Passenger;
import lesson_03.models.vehicles.UberX;
import lesson_03.models.vehicles.Vehicle;
import lesson_03.utilities.PriceCalculator;

public class Main {
    public static void main(String[] args) {

        try {
            // Step 1: Create locations
            Location pickup = new Location("Warsaw Airport");
            Location destination = new Location("Chopin Airport");

            // Step 2: Create a passenger
            Passenger passenger = new Passenger(1L, "Anna", "Ivanova", "012345678");

            // Step 3: Create drivers with vehicles
            Vehicle uberX = new UberX(1L, "Toyota Camry", "White");
            Driver driverID1 = new Driver(1L, "Mike", "Smith", "111222333", 4.9, uberX);

            // Step 4: Passenger requests a ride (creates order)
            Order order = new Order(1001L, passenger, pickup, destination);
            passenger.requestRide(order);

            // Step 5: Calculate cost
            order.setPrice(PriceCalculator.calculatePrice(order, driverID1.getVehicle()));

            // Step 6: Driver accepts the order
            order.acceptOrder(driverID1);

            // Step 7: Execute & complete the trip
            driverID1.startDriving(order);
            driverID1.completeDriving(order);

            // Step 8: Passenger pays
            System.out.println("Payment for ride is done");
            passenger.pay(order);

            // Final summary
            System.out.println("ORDER COMPLETED");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

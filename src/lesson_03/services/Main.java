package lesson_03.services;

import lesson_03.models.infrastructure.Location;
import lesson_03.models.infrastructure.Order;
import lesson_03.models.people.Driver;
import lesson_03.models.people.Passenger;
import lesson_03.models.vehicles.UberBlack;
import lesson_03.models.vehicles.UberEats;
import lesson_03.models.vehicles.UberX;
import lesson_03.models.vehicles.Vehicle;
import lesson_03.utilities.PriceCalculator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // overloading 
        Location pickup = new Location("Main Street 1", "New York");
        Location destination = new Location("Central Park");

        System.out.println("Pickup: " + pickup.getAddress());
        System.out.println("Destination: " + destination.getAddress());

       
        Passenger passenger = new Passenger(1L, "Anna", "Smith", "123456789");
        System.out.println("Passenger created: " + passenger);

        // overloading 
        passenger.requestRide(pickup, destination);

        // polymorphism 1 
        Vehicle car1 = new UberX(1L, "Toyota Camry", "Black");
        System.out.println("Vehicle 1: " + car1);

        // polymorphism 2 -
        Vehicle car2 = new UberBlack(2L, "Mercedes S-Class", "Black");
        System.out.println("Vehicle 2: " + car2);

        // polymorphism
        Vehicle car3 = new UberEats(3L, "Honda Civic", "White");
        System.out.println("Vehicle 3 (delivery): " + car3);

        // overloading 
        Driver newDriver = new Driver(2L, "Mike", "Johnson", "111222333", "EMP002", 1, car2);
        System.out.println("New driver (default rating): " + newDriver);

        Driver driver = new Driver(1L, "John", "Brown", "987654321", "EMP001", 5, 4.8,
                List.of("English", "Spanish"), car1);
        System.out.println("Driver: " + driver);
        // List<String>
        System.out.println("Driver languages: " + driver.getLanguages());

        // overloading 
        Order order = new Order(101L, passenger, pickup, destination, "please hurry");
        passenger.requestRide(order);
        System.out.println("Order created: " + order);

        // overloading 
        double price = PriceCalculator.calculatePrice(order, driver.getVehicle(), 15.0);
        order.setPrice(price);
        System.out.println("Price calculated: $" + price);

        // polymorphism 3 
        double priceBlack = PriceCalculator.calculatePrice(order, car2, 15.0);
        System.out.println("Same trip with UberBlack would cost: $" + priceBlack);

        
        order.acceptOrder(driver);
        System.out.println("Order after accept: " + order);

        
        driver.startDriving(order);
        driver.completeDriving(order);

       
        passenger.pay(order);

        // static 
        System.out.println("Total orders created: " + Order.getTotalOrders());

        // ArrayList 
        passenger.addOrderToHistory(order);
        System.out.println("Passenger order history (ArrayList): " + passenger.getOrderHistory());

        // LinkedList 
        System.out.println("Driver trip history (LinkedList): " + driver.getTripHistory());
        System.out.println("Driver last trip: " + driver.getLastTrip());

       
        Passenger passenger2 = new Passenger(1L, "Anna", "Smith", "123456789");
        System.out.println("Same passenger? " + passenger.equals(passenger2));

        
        System.out.println("Role: " + passenger.getRole());
        System.out.println("Role: " + driver.getRole());


        Object obj1 = passenger;
        Object obj2 = driver;
        Object obj3 = order;
        System.out.println("Object 1 class: " + obj1.getClass().getSimpleName() + " -> " + obj1);
        System.out.println("Object 2 class: " + obj2.getClass().getSimpleName() + " -> " + obj2);
        System.out.println("Object 3 class: " + obj3.getClass().getSimpleName() + " -> " + obj3);
        System.out.println("Are obj1 and obj2 equal? " + obj1.equals(obj2));

        System.out.println("Done! " + order);
    }
}

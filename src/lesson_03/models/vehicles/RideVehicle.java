package lesson_03.models.vehicles;

public abstract class RideVehicle extends Vehicle {

    private Integer maxPassengers;

    public RideVehicle(Long id, String model, String color, Integer maxPassengers) {
        super(id, model, color);
        this.maxPassengers = maxPassengers;
    }

    public Integer getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}

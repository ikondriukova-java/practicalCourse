package lesson_03.models.vehicles;

public abstract class DeliveryVehicle extends Vehicle {

    private Double maxWeightKg;

    public DeliveryVehicle(Long id, String model, String color, Double maxWeightKg) {
        super(id, model, color);
        this.maxWeightKg = maxWeightKg;
    }

    public Double getMaxWeightKg() {
        return maxWeightKg;
    }

    public void setMaxWeightKg(Double maxWeightKg) {
        this.maxWeightKg = maxWeightKg;
    }
}

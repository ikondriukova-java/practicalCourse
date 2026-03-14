package lesson_03.models.vehicles;

public class UberEats extends DeliveryVehicle {

    private static final Double PricePerKm = 0.8;

    public UberEats(Long id, String model, String color) {
        super(id, model, color, 20.0);
    }

    @Override
    public String getVehicleType() {
        return "UberEats";
    }

    @Override
    public Double getPricePerKm() {
        return PricePerKm;
    }

    @Override
    public String toString() {
        return "UberEats{" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxWeightKg=" + getMaxWeightKg() +
                ", pricePerKm=$" + PricePerKm +
                '}';
    }
}

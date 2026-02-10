package lesson_03.models.vehicles;

public class UberX extends Vehicle {

    private static final Double PricePerKm = 1.5;

    public UberX(Long id, String model, String color) {
        super(id, model, color);
    }

    @Override
    public String getVehicleType() {
        return "UberX";
    }

    @Override
    public Double getPricePerKm() {
        return PricePerKm;
    }

    @Override
    public String toString() {
        return "UberX{" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", pricePerKm=$" + PricePerKm +
                '}';
    }
}

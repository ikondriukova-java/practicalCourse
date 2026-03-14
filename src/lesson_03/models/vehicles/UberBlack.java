package lesson_03.models.vehicles;

public class UberBlack extends RideVehicle {

    private static final Double PricePerKm = 3.0;

    public UberBlack(Long id, String model, String color) {
        super(id, model, color, 4);
    }

    @Override
    public String getVehicleType() {
        return "UberBlack";
    }

    @Override
    public Double getPricePerKm() {
        return PricePerKm;
    }

    @Override
    public String toString() {
        return "UberBlack{" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", pricePerKm=$" + PricePerKm +
                '}';
    }
}

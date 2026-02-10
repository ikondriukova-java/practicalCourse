package lesson_03.models.vehicles;

public abstract class Vehicle {

    private Long id;
    private String model;
    private String color;

    public Vehicle(Long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public abstract String getVehicleType();
    public abstract Double getPricePerKm();

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + getVehicleType() +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

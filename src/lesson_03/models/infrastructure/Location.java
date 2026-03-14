package lesson_03.models.infrastructure;

public class Location {

    private String address;

    public Location(String address) {
        this.address = address;
    }

    // overloading 
    public Location(String address, String city) {
        this.address = address + ", " + city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

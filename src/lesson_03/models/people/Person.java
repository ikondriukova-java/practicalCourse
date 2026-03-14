package lesson_03.models.people;

import java.util.Objects;

public abstract class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Person() {
    }

    public Person(Long id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", role='" + getRole() + '\'' +
                ", name='" + firstName + " " + lastName + '\'' +
                ", phone='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (this.hashCode() != person.hashCode()) return false;
        return Objects.equals(id, person.id)
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    // Getters and Setters
    // final 
    public final Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

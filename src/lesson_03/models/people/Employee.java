package lesson_03.models.people;

public abstract class Employee extends Person {

    private String employeeId;
    private Integer yearsOfExperience;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String phoneNumber,
                    String employeeId, Integer yearsOfExperience) {
        super(id, firstName, lastName, phoneNumber);
        this.employeeId = employeeId;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}

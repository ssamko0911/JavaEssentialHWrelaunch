package transporthub.models;

public class Driver {
    private static int idCounter;
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private DriverQualificationEnum driverQualificationEnum;

    public Driver(String firstName, String lastName, String phoneNumber, DriverQualificationEnum driverQualificationEnum) {
        this.id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.driverQualificationEnum = driverQualificationEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public DriverQualificationEnum getDriverQualificationEnum() {
        return driverQualificationEnum;
    }

    public void setDriverQualificationEnum(DriverQualificationEnum driverQualificationEnum) {
        this.driverQualificationEnum = driverQualificationEnum;
    }

    @Override
    public String toString() {
        return String.format("Driver #%d: id - %d, firstName - %s, lastName - %s, phoneNumber - %s, qualification - %s",
                id + 1, id, firstName, lastName, phoneNumber, driverQualificationEnum.name());
    }
}

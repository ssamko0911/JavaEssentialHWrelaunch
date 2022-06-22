package transporthub.models;
/*
	Driver (id, имя, фамилия, номер телефона, уровень квалификации (DriverQualificationEnum)
 */
public class Driver {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private DriverQualificationEnum driverQualificationEnum;

    public Driver(int id, String firstName, String lastName, String phoneNumber, DriverQualificationEnum driverQualificationEnum) {
        this.id = id;
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
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", driverQualificationEnum=" + driverQualificationEnum +
                '}';
    }
}

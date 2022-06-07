package hw007.task002.models;

public class Worker {
    private String nameSurname;
    private String position;
    private int year;

    public Worker(String nameSurname, String position, int year) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.year = year;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("\nName and Surname - %s, position - %s, year - %d.", nameSurname, position, year);
    }
}

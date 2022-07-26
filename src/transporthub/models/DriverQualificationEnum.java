package transporthub.models;

public enum DriverQualificationEnum {
    BUS_DRIVING_LICENCE ("Bus License"),
    TRAM_DRIVING_LICENCE ("Tram License"),
    MULTI_DRIVING_LICENCE ("Multi License");

    private final String name;

    DriverQualificationEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Lic.Type: %s.", this.name);
    }
}

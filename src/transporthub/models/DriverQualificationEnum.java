package transporthub.models;

public enum DriverQualificationEnum {
    BUS_DRIVING_LICENCE(10),
    TRAM_DRIVING_LICENCE(10),
    MULTI_DRIVING_LICENCE(10);

    private int termOfValidity;

    DriverQualificationEnum(int termOfValidity) {
        this.termOfValidity = termOfValidity;
    }

    public int getTermOfValidity() {
        return termOfValidity;
    }

    @Override
    public String toString() {
        return String.format("Driver license: %s.", DriverQualificationEnum.valueOf(name()));
    }
}

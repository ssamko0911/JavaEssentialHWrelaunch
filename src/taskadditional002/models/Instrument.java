package taskadditional002.models;

public class Instrument {
    private long id;
    private String type;

    public Instrument(long id, String type) {
        this.id = id;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void doInstrumentActions() {
        System.out.println("Instrument sounds like this: melody - melody - melody!");
    }

    @Override
    public String toString() {
        return String.format("%s has id - %d, type - %s", Instrument.class.getSimpleName(), id, type);
    }
}

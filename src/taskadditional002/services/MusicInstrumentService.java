package taskadditional002.services;

import taskadditional002.models.Instrument;

import java.util.Optional;

public class MusicInstrumentService {
    private Instrument[] instruments;

    public MusicInstrumentService(Instrument[] instruments) {
        this.instruments = instruments;
    }

    public Instrument[] getInstruments() {
        return instruments;
    }

    public void setInstruments(Instrument[] instruments) {
        this.instruments = instruments;
    }

    public Optional<Instrument> findInstrumentById(int someId) {
        for (Instrument item : instruments) {
            if (item.getId() == someId) {
                return Optional.ofNullable(instruments[someId - 1]);
            }
        }
        return Optional.empty();
    }
}

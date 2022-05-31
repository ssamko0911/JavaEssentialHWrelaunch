package taskadditional002;

import taskadditional002.models.ElectricGuitar;
import taskadditional002.models.Guitar;
import taskadditional002.models.Instrument;
import taskadditional002.services.MusicInstrumentService;

import java.util.Optional;
import java.util.Scanner;

/*
Создать иерархию наследования: Instrument(айди, тип) - Guitar(айди, тип, количествоСтрун)
 - ElectricGuitar(айди, тип, количествоСтрун, мощность).
*Каждому классу создать метод-заглушку, которая могла бы описывать какой-либо функционал
конкретного типа инструмента (doGuitarActions(), doElectricGuitarActions(), и т.д) Создать класс
MusicInstrumentService(Instrument[] instruments), который хранит в себе инструменты.
Создать публичный метод в MusicInstrumentService, который ищет инструмент по заданному ID.
Сделать метод поиска null-safe.
 */
public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(1, "Rhythm", 6),
                new ElectricGuitar(2, "Rhythm", 7, 400),
                new ElectricGuitar(3, "Bass", 4, 300)
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Input ID of instrument to find and get info:");
        MusicInstrumentService musicInstrumentService = new MusicInstrumentService(instruments);
        Optional<Instrument> searchedInstrument = musicInstrumentService.findInstrumentById(in.nextInt());
        if (searchedInstrument.isPresent()) {
            System.out.println(searchedInstrument.get());
        } else {
            System.out.println("Such ID is not exist.");
        }
        in.close();
    }
}

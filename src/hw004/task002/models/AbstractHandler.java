package hw004.task002.models;

import java.util.Locale;

public abstract class AbstractHandler {
    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();
    public void runAllMethods() {
        System.out.println("All methods for chosen type of documents are:".toUpperCase(Locale.ROOT));
        open();
        create();
        change();
        save();
    }
}

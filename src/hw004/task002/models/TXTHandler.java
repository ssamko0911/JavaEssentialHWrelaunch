package hw004.task002.models;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("*TXT* document is opened.");
    }

    @Override
    public void create() {
        System.out.println("*TXT* document has created.");
    }

    @Override
    public void change() {
        System.out.println("*TXT* document has changed.");
    }

    @Override
    public void save() {
        System.out.println("*TXT* document saved.");
    }
}

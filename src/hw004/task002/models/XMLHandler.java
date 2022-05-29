package hw004.task002.models;

public class XMLHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("*XML* document is opened.");
    }

    @Override
    public void create() {
        System.out.println("*XML* document has created.");
    }

    @Override
    public void change() {
        System.out.println("*XML* document has changed.");
    }

    @Override
    public void save() {
        System.out.println("*XML* document saved.");
    }
}

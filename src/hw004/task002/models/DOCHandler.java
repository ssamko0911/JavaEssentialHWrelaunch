package hw004.task002.models;

public class DOCHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("*DOC* document is opened.");
    }

    @Override
    public void create() {
        System.out.println("*DOC* document has created.");
    }

    @Override
    public void change() {
        System.out.println("*DOC* document has changed.");
    }

    @Override
    public void save() {
        System.out.println("*DOC* document saved.");
    }
}

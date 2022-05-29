package hw004.taskadditional001.models;

public abstract class DocumentSoftware {
    public void openDocument() {
        System.out.println("The document is opened.");
    }

    public void editDocument() {
        System.out.println("Document edited.");
    }

    public abstract void saveDocument();
}

package hw004.taskadditional001.models;

public class DocumentWorker extends DocumentSoftware {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    public void editDocument() {
        System.out.println("Editing the document is available in Pro version.");
    }

    public void saveDocument() {
        System.out.println("Saving the document is available in Pro version.");
    }
}

package hw004.taskadditional001.models;

public class ExpertDocumentWorker extends DocumentSoftware {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("Document saved in chosen format.");
    }
}

package hw004.taskadditional001.models;

public class ProDocumentWorker extends DocumentSoftware {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        System.out.println("Document edited.");
    }

    @Override
    public void saveDocument() {
        System.out.println("Document is saved in an old file format. Choosing the format is available in Expert version");
    }
}

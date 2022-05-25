package hw003.task004;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        System.out.println("Document edited.");
    }

    @Override
    void saveDocument() {
        System.out.println("Document is saved in an old file format. Choosing the format is available in Expert version");
    }
}
package hw003.task004;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        super.editDocument();
    }

    @Override
    void saveDocument() {
        System.out.println("Document saved in chosen format.");
    }
}
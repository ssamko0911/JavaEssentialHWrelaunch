package hw003.task002;

public class ExcellentPupil extends Pupil{
    @Override
    void study() {
        System.out.println("My study is excellent!");
    }

    @Override
    void read() {
        System.out.println("Excellent reading!");
    }

    @Override
    void write() {
        System.out.println("Excellent writing!");
    }

    @Override
    void relax() {
        System.out.println("Excellent relax!");
    }
}
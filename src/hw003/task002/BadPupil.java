package hw003.task002;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("My study is bad");
    }

    @Override
    void read() {
        System.out.println("Bad reading!");
    }

    @Override
    void write() {
        System.out.println("Bad writing!");
    }

    @Override
    void relax() {
        System.out.println("Bad relax!");
    }
}
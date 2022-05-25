package hw003.task002;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("My study is good!");
    }

    @Override
    void read() {
        System.out.println("Good reading!");
    }

    @Override
    void write() {
        System.out.println("Good writing!");
    }

    @Override
    void relax() {
        System.out.println("Good relax!");
    }
}
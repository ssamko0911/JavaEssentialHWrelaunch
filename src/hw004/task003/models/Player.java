package hw004.task003.models;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("PLAY");
    }

    @Override
    public void record() {
        System.out.println("REC");
    }

    @Override
    public void pause() {
        System.out.println("PAUSE");
    }

    @Override
    public void stop() {
        System.out.println("STOP");
    }
}

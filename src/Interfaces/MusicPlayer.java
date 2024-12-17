package Interfaces;

public class MusicPlayer implements IMedia{

    @Override
    public void start() {
        System.out.println("Playing song from media.");
    }

    @Override
    public void stop() {
        System.out.println(" Playing song from media.");
    }
}

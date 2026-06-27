package Interfaces.ProperUsage;

interface MusicPlayer {
    int memory_needed_in_mb = 8;

    public void start();
    public void stop();
}

interface VideoPlayer {
    int memory_needed_in_mb = 10;

    public void start();
    public void stop();
    public void display();
}

class AudioPlayer implements MusicPlayer{

    @Override
    public void start() {
        System.out.println("Music started");
    }
    @Override
    public void stop() {
        System.out.println("Music stoped");
    }
}

class MP4player implements VideoPlayer{

    @Override
    public void start() {
        System.out.println("Video started");
    }
    @Override
    public void stop() {
        System.out.println("Video stoped");
    }
    @Override
    public void display() {
        System.out.println("Video playing");
    }

}

class Mobile {
    private MusicPlayer mp;
    private VideoPlayer vp;

    Mobile() {
        mp = new AudioPlayer();
        vp = new MP4player();
    }

    void invoke() {
        mp.start();
        vp.start();
        mp.stop();
        vp.display();
        vp.stop();
        System.out.println("Audio MB consumed is "+ mp.memory_needed_in_mb);
        System.out.println("Video MB consumed is "+ vp.memory_needed_in_mb);
    }
}

public class InterfaceUsage {

    public static void call() {
        Mobile mb = new Mobile();
        mb.invoke();
    }
}
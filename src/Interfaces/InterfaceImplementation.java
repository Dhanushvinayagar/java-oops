package Interfaces;

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

// The Problem here is the start and stop for Music & Video player will gives us same output in Mobile class
// To avoid it create class of Music/video player and use DI to inject the objects into Mobile class

class Mobile implements MusicPlayer, VideoPlayer {
    public void start() {
        System.out.println("Started the App");
    }
    public void stop() {
        System.out.println("Stopeed the App");
    }
    public void display() {
        System.out.println("Showing the video");
    }

}

public class InterfaceImplementation {
        
    static void call() {
        Mobile m = new Mobile();
        m.display();
        
        // Ambiguity error
        // System.out.println(m.memory_needed_in_mb);

        // Upcasting for Interface is also possible
        MusicPlayer mp = new Mobile();
        mp.start();
        System.out.println(mp.memory_needed_in_mb);
    }
}
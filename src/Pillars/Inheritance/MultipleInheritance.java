package Pillars.Inheritance;

// MultipleInheritance - It is a mechanism of child class extend the properties of multiple parent class


// Not possible
//        MusicPlayer     VideoPlayer
//               \           /
//    extends     \         /      extends
//                 MobilePhone

// Because if Both parents have a shared property then Child do not know which property to inherit

// Solution: Use Interface instead

interface MusicPlayer {
    public void playMusic();
}

interface VideoPlayer {
    public void playVideo();
}

class MobilePhone implements MusicPlayer, VideoPlayer {

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing Video");
    }
}

public class MultipleInheritance {

    public static void invoke() {
        System.out.println("Multiple Inheritance is not allowed in java using extends keyword");

        MobilePhone mp = new MobilePhone();
        mp.playMusic();
        mp.playVideo();
    } 
}

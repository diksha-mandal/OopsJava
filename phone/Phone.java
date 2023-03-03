public class Phone {
    public void call() {
        System.out.println("Making a call...");
    }
    
    public void sms() {
        System.out.println("Sending an SMS...");
    }
}

// Camera interface
public interface Camera {
    public void click();
    public void record();
}

// MusicPlayer interface
public interface MusicPlayer {
    public void play();
    public void stop();
}
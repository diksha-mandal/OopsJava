public class ph extends Phone implements Camera, MusicPlayer {
    public void click() {
        System.out.println("Taking a photo...");
    }
    
    public void record() {
        System.out.println("Recording a video...");
    }
    
    public void play() {
        System.out.println("Playing music...");
    }
    
    public void stop() {
        System.out.println("Stopping music...");
    }

    public static void main(String[] args) {
        Phone myPhone = new ph();
        myPhone.call();
        myPhone.sms();
        
        Camera myCamera = new ph();
        myCamera.click();
        myCamera.record();
        
        MusicPlayer myMusicPlayer = new ph();
        myMusicPlayer.play();
        myMusicPlayer.stop();
    }
}

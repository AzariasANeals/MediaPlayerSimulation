
/**
 * This is the AudioPlayer class, it is a subclass of MediaPlayer and 
 * UnitTestHook. This will contain the "AudioPlayer" items, such as musical albums,
 * podcasts, or audiobooks. 
 */
public class AudioPlayer implements MediaPlayer,UnitTestHook
{
    public static final String CLASS_NAME = "AudioPlayer";
    public static final String PLAY_BLURB = " is now playing ";
    public static final String PAUSE_BLURB = " has paused playing ";
    public static final String STOP_BLURB = " has stopped playing ";
    String cassette;
    String status;
    
    public AudioPlayer(){
    
    }

    public String outputStatus(){
        return status;
    }
    
    public void insertCassette(String tape){
        cassette = tape;
    }

    public void play(){
        status = CLASS_NAME + PLAY_BLURB + cassette;
        System.out.println(status);
    }

    public void pause(){
        status = CLASS_NAME + PAUSE_BLURB + cassette;
        System.out.println(status);
    }

    public void stop(){
        status = CLASS_NAME + STOP_BLURB + cassette;
        System.out.println(status);
    }
}

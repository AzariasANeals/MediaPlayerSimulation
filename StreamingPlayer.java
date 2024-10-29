
/**
 * This is the StreamingPlayer class. It is a subclass of MediaPlayer and
 * UnitTestHook. It will contain streams for shows, or movies. Such as "Breaking Bad"
 * or "Casablanca". 
 */
public class StreamingPlayer implements MediaPlayer, UnitTestHook
{
    String playlist;
    String status;
    public static final String CLASS_NAME = "StreamingPlayer";
    public static final String PLAY_BLURB = " is now playing ";
    public static final String PAUSE_BLURB = " has paused playing ";
    public static final String STOP_BLURB = " has stopped playing ";
    public StreamingPlayer(){
        
    }
    
    public String outputStatus(){
        return status;
    }
    
    public void insertPlaylist(String playlist){
        this.playlist = playlist;
    }
    
    public void play(){
        status = CLASS_NAME + PLAY_BLURB + playlist;
        System.out.println(status);
    }
    
    public void pause(){
        status = CLASS_NAME + PAUSE_BLURB + playlist;
        System.out.println(status);      
    }
    
    public void stop(){
        status = CLASS_NAME + STOP_BLURB + playlist;
        System.out.println(status);
    }
}

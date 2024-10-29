
/**
 * This is the VideoPlayer class, it is a subclass of MediaPlayer and UnitTestHook.
 * This will include the video items, such as DVD's, Blu-Rays, and VHS tapes. 
 */
public class VideoPlayer implements MediaPlayer, UnitTestHook
{
    String vhs;
    String status;
    public static final String CLASS_NAME = "VideoPlayer";
    public static final String PLAY_BLURB = " is now playing ";
    public static final String PAUSE_BLURB = " has paused playing ";
    public static final String STOP_BLURB = " has stopped playing ";
    public VideoPlayer(){

    }

    public String outputStatus(){
        return status;
    }

    public void insertVHS(String tape){
        vhs = tape;
    }

    public void play(){
        status = CLASS_NAME + PLAY_BLURB + vhs;
        System.out.println(status);
    }

    public void pause(){
        status = CLASS_NAME + PAUSE_BLURB + vhs;
        System.out.println(status);    
    }

    public void stop(){
        status = CLASS_NAME + STOP_BLURB + vhs;
        System.out.println(status);
    }
}

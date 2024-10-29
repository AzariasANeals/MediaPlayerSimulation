import java.util.ArrayList;

/**
 * This is the main class. This is what will be used to start this simulation.
 * To start the program simply create a new "media player", such as audio, video, or 
 * stream. Then add it to the MediaPlayer ArrayList. Then simply run the program and
 * you will see which media is currently playing, paused, and stopped and the
 * name of it. 
 */
public class Main
{
    public static void main(String[] args){
        AudioPlayer audio = new AudioPlayer();
        audio.insertCassette("The Smiths");
        
        VideoPlayer video = new VideoPlayer();
        video.insertVHS("The Sting");
        
        StreamingPlayer stream = new StreamingPlayer();
        stream.insertPlaylist("Breaking Bad");
        
        ArrayList<MediaPlayer> players = new ArrayList<MediaPlayer>(); 
        
        players.add(audio);
        players.add(video);
        players.add(stream);
        
        for(MediaPlayer m : players){
            m.play();
            m.pause();
            m.stop();
            System.out.println("");
        }
        
    }
}

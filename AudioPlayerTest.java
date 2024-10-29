
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AudioPlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AudioPlayerTest
{
    /**
     * Default constructor for test class AudioPlayerTest
     */
    public AudioPlayerTest()
    {
    }

    // 3 Normal Test Cases
    @Test

    public void testPlay(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.PLAY_BLURB + testCassette;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();
        tester.insertCassette(testCassette);
        tester.play();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    @Test

    public void testPause(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.PAUSE_BLURB + testCassette;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();
        tester.insertCassette(testCassette);
        tester.pause();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    @Test

    public void testStop(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.STOP_BLURB + testCassette;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();
        tester.insertCassette(testCassette);
        tester.stop();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    // 3 edge cases
    @Test
    public void noInsertCassette_Play(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.PLAY_BLURB + testCassette;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();

        tester.play();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertCassetteNull_Play(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.PLAY_BLURB + null;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();

        tester.play();
        actual = tester.outputStatus();

        assertEquals(expected, actual);

    }

    @Test
    public void noInsertCassette_Pause(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.PAUSE_BLURB + testCassette;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();

        tester.pause();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertCassetteNull_Pause(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.PAUSE_BLURB + null;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();

        tester.pause();
        actual = tester.outputStatus();

        assertEquals(expected, actual);

    }

    
        @Test
    public void noInsertCassette_Stop(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.STOP_BLURB + testCassette;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();

        tester.stop();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertCassetteNull_Stop(){
        String testCassette = "Billy Joel";
        String expected = AudioPlayer.CLASS_NAME + AudioPlayer.STOP_BLURB + null;
        String actual = "";
        AudioPlayer tester = new AudioPlayer();

        tester.stop();
        actual = tester.outputStatus();

        assertEquals(expected, actual);

    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}

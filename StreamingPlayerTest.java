
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StreamingPlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StreamingPlayerTest
{
    /**
     * Default constructor for test class StreamingPlayerTest
     */
    public StreamingPlayerTest()
    {
    }

    // 3 Normal Test Cases
    @Test

    public void testPlay(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.PLAY_BLURB + testPlaylist;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();
        tester.insertPlaylist(testPlaylist);
        tester.play();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    @Test

    public void testPause(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.PAUSE_BLURB + testPlaylist;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();
        tester.insertPlaylist(testPlaylist);
        tester.pause();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    @Test

    public void testStop(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.STOP_BLURB + testPlaylist;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();
        tester.insertPlaylist(testPlaylist);
        tester.stop();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    // 3 edge cases
    @Test
    public void noInsertPlaylist_Play(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.PLAY_BLURB + testPlaylist;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();

        tester.play();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertPlaylistNull_Play(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.PLAY_BLURB + null;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();

        tester.play();
        actual = tester.outputStatus();

        assertEquals(expected, actual);

    }

    @Test
    public void noInsertPlaylist_Pause(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.PAUSE_BLURB + testPlaylist;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();

        tester.pause();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertPlaylistNull_Pause(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.PAUSE_BLURB + null;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();

        tester.pause();
        actual = tester.outputStatus();

        assertEquals(expected, actual);

    }

    @Test
    public void noInsertPlaylist_Stop(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.STOP_BLURB + testPlaylist;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();

        tester.stop();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertPlaylistNull_Stop(){
        String testPlaylist = "Breaking Bad";
        String expected = StreamingPlayer.CLASS_NAME + StreamingPlayer.STOP_BLURB + null;
        String actual = "";
        StreamingPlayer tester = new StreamingPlayer();

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

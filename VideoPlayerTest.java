
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class VideoPlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VideoPlayerTest
{
    /**
     * Default constructor for test class VideoPlayerTest
     */
    public VideoPlayerTest()
    {
    }

    // 3 Normal Test Cases
    @Test

    public void testPlay(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.PLAY_BLURB + testVHS;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();
        tester.insertVHS(testVHS);
        tester.play();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    @Test

    public void testPause(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.PAUSE_BLURB + testVHS;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();
        tester.insertVHS(testVHS);
        tester.pause();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    @Test

    public void testStop(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.STOP_BLURB + testVHS;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();
        tester.insertVHS(testVHS);
        tester.stop();
        actual = tester.outputStatus();

        assertEquals(expected, actual);
    }

    // 3 edge cases
    @Test
    public void noInsertVHS_Play(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.PLAY_BLURB + testVHS;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();

        tester.play();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertVHSNull_Play(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.PLAY_BLURB + null;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();

        tester.play();
        actual = tester.outputStatus();

        assertEquals(expected, actual);

    }

    @Test
    public void noInsertVHS_Pause(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.PAUSE_BLURB + testVHS;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();

        tester.pause();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertVHSNull_Pause(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.PAUSE_BLURB + null;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();

        tester.pause();
        actual = tester.outputStatus();

        assertEquals(expected, actual);

    }

    @Test
    public void noInsertVHS_Stop(){
        String testVHS = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.STOP_BLURB + testVHS;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();

        tester.stop();
        actual = tester.outputStatus();

        assertNotEquals(expected, actual);

    }

    @Test

    public void noInsertVHSNull_Stop(){
        String testCassette = "Jumanji";
        String expected = VideoPlayer.CLASS_NAME + VideoPlayer.STOP_BLURB + null;
        String actual = "";
        VideoPlayer tester = new VideoPlayer();

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

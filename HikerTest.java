import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void testEmptyString() {
        String expected = "0";
        String actual = Hiker.answer("");
        assertEquals(expected, actual);
       
    }
     @Test
    public void testEmptyString1() {
        String expected = "1";
        String actual = Hiker.answer("1");
        assertEquals(expected, actual);
       
    }
     @Test
    public void testEmptyString2() {
        String expected = "15";
        String actual = Hiker.answer("5,5,5");
        assertEquals(expected, actual);
       
    }
      @Test
    public void testEmptyString3() {
        String expected = "25";
        String actual = Hiker.answer("5,5,5,5,5");
        assertEquals(expected, actual);
       
    }
}

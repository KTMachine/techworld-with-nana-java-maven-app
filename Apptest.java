import com.example.Application;
import org.junit.Test;
import static org.junit.Asser.*;

public class AppTest {

    @Test
    public void testApp() {
        Application myApp = new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}

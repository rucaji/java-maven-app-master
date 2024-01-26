package test.java;
import com.example.Application;
import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

import com.example.Application;

public class AppTest {
    @Test 
    public void testApp(){
        Application myApp = new Application();
        String result = myApp.getStatus();
        assertEquals("OK", result);
    }

}

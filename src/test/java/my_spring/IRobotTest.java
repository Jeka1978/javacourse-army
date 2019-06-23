package my_spring;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class IRobotTest {

    @Test
    public void cleanRoom() {
        IRobot iRobot = new IRobot();
        iRobot.setCleaner(Mockito.mock(Cleaner.class));
    }
}
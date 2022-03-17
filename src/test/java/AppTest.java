import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void printHelloWorld() {
        App a1 = new App();
        String expected = "Hello World.";
        String actual = a1.printHelloWorld();
        assertEquals(expected, actual);
    }
}
import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void hello() {
        String name = "Котик";
        Assertions.assertEquals("Hello " + name, Main.hello(name));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int a = 2, b = 3;
        Assertions.assertEquals(a * b, Main.multiply(a, b));
    }
}
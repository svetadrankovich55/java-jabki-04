import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void hello() {
        String name = "Котик";
        assertEquals("Hello " + name, Main.hello(name));
    }

    @Test
    void multiply() {
        int a = 2, b = 33;
        assertEquals(a * b, Main.multiply(a, b));
    }

    @Test
    void sumRange() {
        assertEquals(90, Main.sumRange(2, 13));
        assertEquals(-15, Main.sumRange(-5, -1));
        assertEquals(0, Main.sumRange(-3, 3));
        assertThrows(IllegalArgumentException.class, () -> Main.sumRange(5, 1));
        assertThrows(IllegalArgumentException.class, () -> Main.sumRange(0, -1));

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.sumRange(0, -1));
        assertEquals("Параметр A должен быть меньше параметра B", exception.getMessage());
    }

    @Test
    void add() {
        assertEquals( 15, Main.add(2, 13));
        assertEquals(-5, Main.add(-2, -3));
        assertEquals(0, Main.add(-1, 1));
        assertEquals(-10, Main.add(5, -15));

    }

    @Test
    void testAdd() {

        assertEquals("Привет мир!", Main.add("Привет", "мир!"));
        assertEquals("Hello World", Main.add("Hello", "World"));
        assertEquals("   ", Main.add(" ", " "));
    }

    @Test
    void findMax() {
        assertEquals(5, Main.findMax(new int[]{1, 3, 5, 2}));
        assertEquals(-1, Main.findMax(new int[]{-5, -3, -1, -10}));
        assertEquals(0, Main.findMax(new int[]{0, -1, -2}));
        assertEquals(100, Main.findMax(new int[]{100}));
        assertThrows(IllegalArgumentException.class, () -> Main.findMax(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Main.findMax(null));

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.findMax(new int[]{}));
        assertEquals("Массив не может быть пустым", exception.getMessage());

    }

    @Test
    void factorialByFor() {
        assertEquals(1, Main.factorialByFor(0));
        assertEquals(1, Main.factorialByFor(1));
        assertEquals(120, Main.factorialByFor(5));
        assertThrows(IllegalArgumentException.class, () -> Main.factorialByFor(-1));
        assertThrows(IllegalArgumentException.class, () -> Main.factorialByFor(-10));

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.factorialByFor(-2));
        assertEquals("Факториал определен только для n >= 0", exception.getMessage());

    }

    private static final double DELTA = 0.0001;

    @Test
    void calculateArea() {
        assertEquals(3.142, Main.calculateArea(1.0), DELTA);
        assertEquals(28.274, Main.calculateArea(3.0), DELTA);
        assertEquals(0.0, Main.calculateArea(0.0), DELTA);
        assertEquals(7.069, Main.calculateArea(1.5), DELTA);
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(-1.0));

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.calculateArea(-2.0));
        assertEquals("Радиус не может быть отрицательным", exception.getMessage());

    }

    @Test
    void testCalculateArea() {
        assertEquals(20, Main.calculateArea(4, 5));
        assertEquals(1, Main.calculateArea(1, 1));
        assertEquals(0, Main.calculateArea(0, 5));
        assertEquals(0, Main.calculateArea(0, 0));
        assertEquals(0, Main.calculateArea(0, 10));
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> Main.calculateArea(5, -1));
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.calculateArea(-2, 3));
        assertEquals("Длина или ширина не могут быть отрицательными", exception.getMessage());
        
    }

    @Test
    void arithmeticMean() {
        assertEquals(16.0, Main.averageCalculator(2, 4, 6));
        assertEquals(0.0, Main.averageCalculator(2, 0, 6));
        assertEquals(4.375, Main.averageCalculator(1.5, 2.5, 3.5));
    }

    @Test
    void hypotenuseLength() {
        assertEquals(13.0, Main.hypotenuseLength(5, 12), DELTA);
        assertEquals(7.071, Main.hypotenuseLength(5, 5), DELTA);
        assertEquals(3.0, Main.hypotenuseLength(3, 0), DELTA);
        assertEquals(4.0, Main.hypotenuseLength(0, 4), DELTA);
        assertEquals(0.0, Main.hypotenuseLength(0, 0), DELTA);
        assertThrows(IllegalArgumentException.class, () -> Main.hypotenuseLength(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> Main.hypotenuseLength(5, -1));

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.hypotenuseLength(-2, 3));
        assertEquals("Катеты треугольника не могут быть отрицательными", exception.getMessage());



    }
}
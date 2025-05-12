//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printHello();
        System.out.println("Elena");

        System.out.printf("%s * %s = %s", 2, 3, multiply(2, 3));

        int factorial = factorial(3);
        System.out.println(factorial);

        System.out.println(sumRange(4, 5));
        System.out.println(add(6, 13));
        System.out.println(add("Котик", "Прошик"));

        int[] numbers = {5, 10, 2, 8, 3};
        System.out.println(findMax(numbers));
        System.out.println(factorialByFor(6));

        double circleArea = calculateArea(5);
        System.out.println("Площадь круга: " + circleArea);

        double rectangleArea = calculateArea(5, 4);
        System.out.println("Площадь прямоугольника: " + rectangleArea);

        double average = averageCalculator(5, 10, 15);
        System.out.println("Среднее арифметическое: " + average);

        double hypotenuseLength = hypotenuseLength(7, 5);
        System.out.println("Длина гипотенузы: " + hypotenuseLength);

    }

    /**
     * модификаторы доступа
     * static - вызов метода возможен без создания объекта
     * возвращаемый тип или void
     * имя метода
     * входящие параметры
     */
    public static void printHello() {
        System.out.println("Hello");
    }

    public static String hello(String name) {
        return "Hello " + name;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Одинаковые название методов, но разные типы данных (входящие) или количество параметров
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Рекурсия
     * Факториал 3! = 1 * 2 * 3 =6
     */

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumRange(int a, int b) {
        if (a >= b) {
            throw new IllegalArgumentException("Параметр A должен быть меньше параметра B");
        }
        int sumRange = 0;
        for (int i = a; i <= b; i++) {
            sumRange += i;
        }
        return sumRange;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int factorialByFor(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для n >= 0");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double pi = Math.PI;
        return Math.round((pi * radius * radius) * 1000) / 1000.0;
    }

    public static int calculateArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Длина или ширина не могут быть отрицательными");
        }
        return a * b;
    }

    public static double averageCalculator(double a, double b, double c) {
        return (a * b * c) / 3;
    }

    public static double hypotenuseLength(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Катеты треугольника не могут быть отрицательными");
        }
        return Math.round(Math.sqrt(a * a + b * b) * 1000) / 1000.0;
    }
}
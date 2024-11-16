public class Calculator {

    // Обобщенный метод для сложения
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Обобщенный метод для умножения
    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    // Обобщенный метод для деления
    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a.doubleValue() / b.doubleValue();
    }

    // Обобщенный метод для вычитания
    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }
}
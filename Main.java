public class Main {
    public static void main(String[] args) {
        // Тестирование Calculator
        System.out.println("Sum: " + Calculator.sum(10, 20.5));
        System.out.println("Multiply: " + Calculator.multiply(3, 4.5));
        System.out.println("Divide: " + Calculator.divide(10, 2));
        System.out.println("Subtract: " + Calculator.subtract(15, 7));

        // Тестирование compareArrays
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2, 4};
        System.out.println("Arrays equal: " + ArrayUtils.compareArrays(array1, array2)); // true
        System.out.println("Arrays equal: " + ArrayUtils.compareArrays(array1, array3)); // false

        // Тестирование Pair
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println(pair);
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
    }
}

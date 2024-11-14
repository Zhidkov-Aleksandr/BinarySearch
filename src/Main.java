import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тестирование всех методов бинарного поиска в MyArrays
        System.out.println("Тестирование методов MyArrays:");

        // Тесты для byte массивов
        byte[] byteArray = {1, 2, 3, 4, 5};
        System.out.println("Тест для byte массивов: ");
        System.out.println(MyArrays.binarySearch(byteArray, (byte) 3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(byteArray, (byte) 6)); // Ожидается -6
        System.out.println(MyArrays.binarySearch(byteArray, 0, byteArray.length, (byte) 3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(byteArray, 0, byteArray.length, (byte) 6)); // Ожидается -6

        // Тесты для char массивов
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Тест для char массивов: ");
        System.out.println(MyArrays.binarySearch(charArray, 'c')); // Ожидается 2
        System.out.println(MyArrays.binarySearch(charArray, 'f')); // Ожидается -6
        System.out.println(MyArrays.binarySearch(charArray, 0, charArray.length, 'c')); // Ожидается 2
        System.out.println(MyArrays.binarySearch(charArray, 0, charArray.length, 'f')); // Ожидается -6

        // Тесты для double массивов
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Тест для double массивов: ");
        System.out.println(MyArrays.binarySearch(doubleArray, 3.3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(doubleArray, 6.6)); // Ожидается -6
        System.out.println(MyArrays.binarySearch(doubleArray, 0, doubleArray.length, 3.3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(doubleArray, 0, doubleArray.length, 6.6)); // Ожидается -6

        // Тесты для float массивов
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println("Тест для float массивов: ");
        System.out.println(MyArrays.binarySearch(floatArray, 3.3f)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(floatArray, 6.6f)); // Ожидается -6
        System.out.println(MyArrays.binarySearch(floatArray, 0, floatArray.length, 3.3f)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(floatArray, 0, floatArray.length, 6.6f)); // Ожидается -6

        // Тесты для int массивов
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Тест для int массивов: ");
        System.out.println(MyArrays.binarySearch(intArray, 3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(intArray, 6)); // Ожидается -6
        System.out.println(MyArrays.binarySearch(intArray, 0, intArray.length, 3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(intArray, 0, intArray.length, 6)); // Ожидается -6

        // Тесты для long массивов
        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        System.out.println("Тест для long массивов: ");
        System.out.println(MyArrays.binarySearch(longArray, 3L)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(longArray, 6L)); // Ожидается -6
        System.out.println(MyArrays.binarySearch(longArray, 0, longArray.length, 3L)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(longArray, 0, longArray.length, 6L)); // Ожидается -6

        // Тесты для short массивов
        short[] shortArray = {1, 2, 3, 4, 5};
        System.out.println("Тест для short массивов: ");
        System.out.println(MyArrays.binarySearch(shortArray, (short) 3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(shortArray, (short) 6)); // Ожидается -6
        System.out.println(MyArrays.binarySearch(shortArray, 0, shortArray.length, (short) 3)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(shortArray, 0, shortArray.length, (short) 6)); // Ожидается -6

        // Тестирование объектов с Comparator
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        System.out.println("Тестирование объектов с Comparator: ");
        Comparator<String> comparator = String::compareTo; // Использование стандартного компаратора
        System.out.println(MyArrays.binarySearch(stringArray, "cherry", comparator)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(stringArray, "grape", comparator)); // Ожидается -5
        System.out.println(MyArrays.binarySearch(stringArray, 0, stringArray.length, "cherry", comparator)); // Ожидается 2
        System.out.println(MyArrays.binarySearch(stringArray, 0, stringArray.length, "grape", comparator)); // Ожидается -5

        // Тестирование методов MyCollections
        System.out.println("\nТестирование методов MyCollections:");

        // Тесты для списков
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Тесты для списков: ");
        System.out.println(MyCollections.binarySearch(intList, 3)); // Ожидается 2
        System.out.println(MyCollections.binarySearch(intList, 6)); // Ожидается -6
        System.out.println(MyCollections.binarySearch(intList, 3, Integer::compareTo)); // Ожидается 2
        System.out.println(MyCollections.binarySearch(intList, 6, Integer::compareTo)); // Ожидается -6
    }
}
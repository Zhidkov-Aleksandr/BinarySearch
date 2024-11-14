import java.util.Comparator;
import java.util.List;

public class MyCollections {

    // бинарный поиска элемента в списке.
    public static <T> int binarySearch(List<? extends T> list, T key) {
        return binarySearch(list, 0, list.size(), key, null);
    }
    // добавляем компаратор
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return binarySearch(list, 0, list.size(), key, c);
    }
    // принимаем список, начальный и конечный индексы, ключ для поиска и компаратор.
    private static <T> int binarySearch(List<? extends T> list, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (fromIndex >= toIndex) return -(fromIndex + 1);
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            T midVal = list.get(mid);
            int cmp = (c == null) ? ((Comparable<? super T>) midVal).compareTo(key) : c.compare(midVal, key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid; // есть совпадения
            }
        }
        return -(fromIndex + 1); // нет совпадений
    }
}
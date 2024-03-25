import java.util.*;
public class cert {

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();

        addNumber("Petrov", 123159, bookPhone);
        addNumber("Ivanov", 546585, bookPhone);
        addNumber("Petrov", 1234, bookPhone);
        addNumber("Sidorov", 8956477, bookPhone);
        addNumber("Petrov", 12356233, bookPhone);
        addNumber("Ivanov", 787897, bookPhone);
        printBook(bookPhone);
    }
}

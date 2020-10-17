package exercise.task_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stwórz klasę Storage, która będzie miała:
 * - prywatne pole typu Map,
 * - publiczny konstruktor
 *
 * oraz metody:
 *
 * - addValueToStorage(String key, String value) → dodawanie elementów do przechowywalnia
 * - printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
 * - findValues(String values) → wyświetlanie wszystkich kluczy, które mają podaną wartość
 *
 * Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem
 */

public class Storage {

    private Map<String, List<String>> multiMap = new HashMap<>();

    public void addValueToStorage(String key, String value) {
        List<String> strings = multiMap.get(key);
        if (strings == null) {
            strings = new ArrayList<>();
        }
        strings.add(value);
        multiMap.put(key, strings);
    }

    public void printValues(String key) {
        List<String> values = multiMap.get(key);
        System.out.println("value for key " + key + " is " + values);
    }

    public List<String> findValues(String values) {
        return multiMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(values))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addValueToStorage("Team A", "Bob");
        storage.addValueToStorage("Team A", "Fred");
        storage.addValueToStorage("Team B", "Fred");
        storage.addValueToStorage("Team Z", "Sam");

        System.out.println(storage.findValues("Fred"));
        //storage.printValues("Team A");

        Storage storage1 = new Storage();
        storage1.printValues("Bob");
    }

}

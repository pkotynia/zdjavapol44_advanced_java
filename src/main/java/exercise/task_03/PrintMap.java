package exercise.task_03;

import java.util.Iterator;
import java.util.Map;

/**
 * Stwórz metodę, która jako parametr przyjmuje mapę,
 * gdzie kluczem jest string, a wartością liczba,
 * a następnie wypisuje każdy element mapy do konsoli w formacie:
 *
 * Klucz: <k>, Wartość: <v>.
 *
 * Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
 *
 * Przykład:
 *
 * Klucz: Java, Wartość: 18,
 * Klucz: Python, Wartość: 7,
 * ,...
 * Klucz: PHP, Wartość: 3.
 */

public class PrintMap {

    static void printMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        StringBuilder builder = new StringBuilder();
        while (iterator.hasNext()) {
            Map.Entry pair = iterator.next();
            builder.append("Klucz: ");
            builder.append(pair.getKey());
            builder.append(" Wartość: ");
            builder.append(pair.getValue());
            builder.append(iterator.hasNext() ? "," : ".");
            builder.append("\n");
        }

        System.out.println(builder);
    }

    public static void main(String[] args) {

        Map<String, Integer> languagesValues = Map.of("Java", 8, "Scala", 18, "Haskell", 100);
        PrintMap.printMap(languagesValues);

    }

}

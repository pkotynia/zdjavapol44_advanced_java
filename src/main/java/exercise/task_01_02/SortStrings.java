package exercise.task_01_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów,
 * następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
 *
 * Zmodyfikuj zadanie tak, żeby sortowanie pomijało wielkość liter
 */

public class SortStrings {

    List<String> sortStrings(List<String> list) {

        return list.stream()
                .sorted((s1, s2) -> -s1.toLowerCase().compareTo(s2.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> names = List.of("Sam", "bob", "Fred");

        SortStrings sortStrings = new SortStrings();

        System.out.println(sortStrings.sortStrings(names));

    }


}

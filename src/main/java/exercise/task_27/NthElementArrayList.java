package exercise.task_27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Rozszerz klasę ArrayList<E> implementując metodę getEveryNthElement().
 *
 * Metoda ta zwraca listę elementów oraz przyjmuje dwa parametry:
 * indeks elementu, od którego zaczyna
 * oraz liczbę określającą co który element ma wybierać.
 *
 * Dla listy: [a, b, c, d, e, f, g] oraz parametrów:
 * startIndex=2 i skip=3 zwróci listę [c, g]
 */

public class NthElementArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement (Integer startIndex, Integer nthElement) {
        return IntStream
                .range(0, super.size())
                .filter(i -> i >= startIndex)
                .filter(i -> i % nthElement == 0)
                .mapToObj(i -> super.get(i))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        NthElementArrayList<Integer> integers = IntStream
                .rangeClosed(0, 100)
                .boxed()
                .collect(Collectors.toCollection(() -> new NthElementArrayList<>()));

        System.out.println(integers);

        System.out.println(integers.getEveryNthElement(2, 3));

        System.out.println(integers);
    }



}

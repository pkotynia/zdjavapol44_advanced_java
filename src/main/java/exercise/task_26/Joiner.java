package exercise.task_26;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Zaprojektuj klasę Joiner<T>,
 * która w konstruktorze będzie przyjmowała separator (string)
 * oraz posiadała metodę join() pozwalającą na podanie dowolnej ilości obiektów typu T.
 *
 * Metoda ta będzie zwracać stringa łącząc wszystkie przekazane elementy
 * wywołując ich metodę toString() i oddzielać je separatorem
 * np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4...
 */

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        return Arrays.stream(elements)
                .map(element -> element.toString())
                .collect(Collectors.joining(separator));
    }

    public static void main(String... args) {
        Joiner<Integer> integerJoiner = new Joiner<>("-");
        System.out.println("joined integers " + integerJoiner.join(1, 2, 3, 4, 5 ));

        Joiner<Object> objectJoiner = new Joiner<>(" ~ ");
        System.out.println("object joiner " + objectJoiner.join(new Object(), new Object(), new Object()));

        Object o = new Object();
        Integer integer = new Integer(6);

        o = integer;
        //objectJoiner = integerJoiner; !!! Compilation error
        //Joiner<Integer> != Joiner<Object>

        System.out.println(o);



    }
}

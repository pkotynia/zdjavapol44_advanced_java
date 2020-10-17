package exercise.task_05;

import java.util.HashSet;
import java.util.Set;

/**
 * Zaimplementuj klasę SDAHashSet<E>, która będzie implementować logikę HashSet<E>.
 * W tym celu zaimplementuj obsługę metod:
 * •add
 * •remove
 * •size
 * •contains
 * •clear
 * @param <E>
 */

public class SDAHashSet<E> {

    private Set<E> sdaSet = new HashSet<>();

    public void add(E element) {
        sdaSet.add(element);
    }

    public void remove(E element) {
        sdaSet.remove(element);
    }

    public static void main(String[] args) {
        SDAHashSet<Integer> sdaHashSet = new SDAHashSet<>();

        sdaHashSet.add(6);


    }

}

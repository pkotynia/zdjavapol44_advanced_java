package exercise.task_23;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Stwórz klasę Zoo, która będzie posiadała zbiór zwierząt oraz pozwalała na otrzymywanie statystyk na temat posiadanych zwierząt:
 *
 * int getNumberOfAllAnimals()→ zwraca liczbę wszystkich zwierząt
 *
 * Map<String, Integer> getAnimalsCount()→ zwraca liczbę zwierząt każdego gatunku
 *
 * Map<String, Integer> getAnimalsCountSorted()→ zwraca liczbę zwierząt każdego gatunku
 * posortowaną na podstawie ilości zwierząt danego gatunku,
 * gdzie pierwszym elementem zawsze jest gatunek z największą ilością zwierząt
 *
 * void addAnimal(Animal)→ dodaje n zwierząt danego gatunku
 */

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Map<Species, Long> getAnimalsCount() {
        return animals.stream()
                //change  Animal -> species
                .map(animal -> animal.getSpecies())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public LinkedHashMap<Species, Long> getAnimalsCountSorted() {
        return getAnimalsCount()
                .entrySet()
                .stream()
                .sorted((c1, c2) -> -c1.getValue().compareTo(c2.getValue()))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (oldValue, newValue) -> newValue,
                        LinkedHashMap::new
                ));
    }

    public static void main(String[] args) {
        Animal alex = new Animal("Alex", Species.LION);
        Animal kowalski = new Animal("Kowalski", Species.PENGUIN);
        Animal rico = new Animal("rico", Species.PENGUIN);

        Zoo zoo = new Zoo();
        zoo.addAnimal(alex);
        zoo.addAnimal(kowalski);
        zoo.addAnimal(rico);

        System.out.println(zoo.getAnimalsCountSorted());
    }
}


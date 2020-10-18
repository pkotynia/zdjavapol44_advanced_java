package exercise.task_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stwórz klasę enum Runner ze stałymi BEGINNER, INTERMEDIATE, ADVANCED.
 * Enum powinien posiadać dwa parametry:
 * •minimalny czas przebiegnięcia maratonu w minutach
 * •maksymalny czas przebiegnięcia maratonu w minutach
 *
 * Dodatkowo enum Runner powinien zawierać metodę statyczną getFitnessLevel(),
 * która przyjmuje na wejściu dowolny czas przebiegnięcia maratonu,
 * a jako rezultat powinna zwracać konkretny obiekt.
 */
public enum Runner {

    BEGINNER(270, 330),
    INTERMEDIATE(210, 269),
    ADVANCED(121, 209);

    private int minimalTime;
    private int maximalTime;

    Runner(int minimalTime, int maximalTime) {
        this.minimalTime = minimalTime;
        this.maximalTime = maximalTime;
    }

    static Runner getFitnessLevel(int marathonTime) {
        List<Runner> matchingRunner = Arrays.stream(values())
                .filter(value -> value.minimalTime < marathonTime && marathonTime < value.maximalTime)
                .collect(Collectors.toList());
        if (matchingRunner.size() != 1) {
            throw new IllegalStateException();
        }
        return matchingRunner.get(0);
    }

    public static void main(String[] args) {

        Runner me = getFitnessLevel(300);

        System.out.println("My fitness level is " + me);
    }
}

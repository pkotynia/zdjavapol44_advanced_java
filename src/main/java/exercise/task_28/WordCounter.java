package exercise.task_28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Napisz program, który policzy wystąpienia każdego słowa w pliku tekstowym
 * a następnie wyniki zapisze w formie tabelki w nowym pliku.
 */

public class WordCounter {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));

        Path inputPath = Paths.get("C:\\Users\\pkotynia\\Documents\\developer\\!SDA\\zdjavapol44_advanced_java\\src\\main\\java\\exercise\\task_28\\words");

        System.out.println(Files.readAllLines(inputPath));

        Map<String, Long> wordFrequency = Files.readAllLines(inputPath)
                .stream()
                .map(line -> Arrays.asList(line.split("\\s+"))) //List<List<String>>
                .flatMap(Collection::stream) //List<String>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFrequency);

    }


}

package exercise.task_07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Stwórz klasę modelującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora.
 * Zaimplementuj metody:
 * - loadBullet(Bullet bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
 * - isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
 * - shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden ostatni załadowany nabój i przygotowuje kolejny,
 * załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek
 */

public class Gun {

    private List<Bullet> cartridgeMagazine = new ArrayList<>();
    private Integer maxSize;

    public Gun(Integer maxSize) {
        this.maxSize = maxSize;
    }

    // dependency injection
    public void loadBullet(Bullet bullet) {
        if (cartridgeMagazine.size() < maxSize) {
            cartridgeMagazine.add(bullet);
            System.out.println("Bullet added");
        } else {
            System.out.println("Unable to add bullet");
        }
    }

    public void shot() {
        if (!cartridgeMagazine.isEmpty()) {
            System.out.println("Bang!!!");
            cartridgeMagazine.remove(0);
        } else {
            System.out.println("No more bullets");
        }
    }

    public static void main(String[] args) {
        Gun p64 = new Gun(8);

        IntStream.rangeClosed(1, 10).forEach(i -> p64.loadBullet(new Bullet()));

        IntStream.rangeClosed(1, 10).forEach(i -> p64.shot());
    }
}

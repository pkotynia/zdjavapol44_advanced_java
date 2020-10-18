package exercise.task_20;

import java.util.Optional;

/**
 * Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami
 * calculatePerimeter() służącą do obliczania obwodu
 * oraz
 * calculateArea() służącą do obliczania powierzchni.
 *
 * Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape,
 * odpowiednio implementując metody abstrakcyjne.
 *
 * Sprawdź poprawność działania.
 */

public abstract class Shape {

    private Double area;
    private Double perimeter;

    public abstract Double calculatePerimeter();
    public abstract Double calculateArea();

    protected Double cachePerimeter(Double perimeter) {
        System.out.println("Caching perimeter");
        this.perimeter = perimeter;
        return perimeter;
    }

    protected Double cacheArea(Double area) {
        this.area = area;
        return area;
    }

    public Optional<Double> getPerimeter() {
        return Optional.ofNullable(perimeter);
    }
}

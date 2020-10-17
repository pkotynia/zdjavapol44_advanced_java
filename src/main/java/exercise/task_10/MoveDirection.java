package exercise.task_10;

/**
 * Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i konstruktor.
 * Stwórz interfejs Movable posiadający metodę move(MoveDirection moveDirection).
 * Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle).
 * Przy wywołaniu metody move(MoveDirection moveDirection),
 * obiekty mają zmienić swoje położenie na podstawie przekazanego kierunku (MoveDirection).
 * Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle.
 */

public class MoveDirection {

    private double x;
    private double y;

    public MoveDirection(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

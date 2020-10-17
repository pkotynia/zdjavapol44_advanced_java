package exercise.task_09;

/**
 * Stwórz klasę Point2D posiadającą pola doublex, doubley, gettery, settery oraz konstruktor.
 * Następnie stwórz klasę Circle, która będzie miała konstruktor:Circle(Point2D center, Point2D point)
 * pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu.
 * Na podstawie tych punktów, klasa Circle ma określać:
 * •promień okręgu przy wywołaniu metody double getRadius()
 * •obwód okręgu przy wywołaniu metody double getPerimeter()
 * •pole okręgu przy wywołaniu metody double getArea()
 *
 * •*(trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List<Point2D> getSlicePoints()
 */

public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
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

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

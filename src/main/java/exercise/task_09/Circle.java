package exercise.task_09;

import exercise.task_10.Movable;
import exercise.task_10.MoveDirection;
import exercise.task_11.Resizable;

import java.util.List;

public class Circle implements Movable, Resizable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        double yDistance = point.getY() - center.getY();
        double xDistance = point.getX() - center.getX();
        return Math.sqrt(yDistance*yDistance + xDistance * xDistance);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.setX(center.getX() + moveDirection.getX());
        center.setY(center.getY() + moveDirection.getY());
        point.setY(point.getY() + moveDirection.getY());
        point.setX(point.getX() + moveDirection.getX());
    }

    //Check for minus center point
    @Override
    public void resize(double resizeFactor) {
        point.setY(point.getY() + resizeFactor);
        point.setX(point.getX() + resizeFactor);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (center != null ? !center.equals(circle.center) : circle.center != null) return false;
        return point != null ? point.equals(circle.point) : circle.point == null;

    }

    @Override
    public int hashCode() {
        int result = center != null ? center.hashCode() : 0;
        result = 31 * result + (point != null ? point.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(0.0, 1.0));
        Circle circle1 = new Circle(new Point2D(5.0, 5.0), new Point2D(2.0, 1.0));

        System.out.println("radius is " + circle.getRadius());

        System.out.println(circle);
        circle.move(new MoveDirection(1.0, 1.0));

        System.out.println(circle.toString());

        List<Movable> movables = List.of(circle, circle1);

        movables.forEach(movable -> movable.move(new MoveDirection(1.0, 1.0)));
    }
}

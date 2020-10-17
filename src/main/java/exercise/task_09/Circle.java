package exercise.task_09;

import exercise.task_10.Movable;
import exercise.task_10.MoveDirection;

import java.util.List;

public class Circle implements Movable {

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

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
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

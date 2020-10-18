package exercise.task_20;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
       return getPerimeter().orElseGet(() -> cachePerimeter(2*length + 2*width));
    }

    @Override
    public Double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0, 2.0);
        System.out.println("rectangle area is " + rectangle.calculateArea());
        System.out.println("rectangle perimeter is " + rectangle.calculatePerimeter());
        System.out.println("rectangle perimeter is " + rectangle.calculatePerimeter());

    }
}

package exercise.task_21;

public class Cube extends Shape3D {

    private Double side;

    public Cube(Double side) {
        this.side = side;
    }

    @Override
    public Double calculateVolume() {
        return getVolume().orElseGet(() -> cacheVolume(Math.pow(side, 3)));
    }

    @Override
    public Double calculatePerimeter() {
        return getPerimeter().orElseGet(() -> cachePerimeter(12 * side));
    }

    @Override
    public Double calculateArea() {
        return null;
    }

    public static void main(String[] args) {
        Shape3D cube = new Cube(1.0);

        System.out.println("Volume of Cube is " + cube.calculateVolume());
        System.out.println("Perimeter of Cube is " + cube.calculatePerimeter());

        cube.fill(1.5);

    }
}

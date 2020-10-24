package exercise.task_17;

public class Converter {

    private double factor;

    public Converter(double factor) {
        this.factor = factor;
    }

    public double convert(int value) {
        return factor * value;
    }
}

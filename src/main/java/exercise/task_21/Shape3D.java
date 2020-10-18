package exercise.task_21;

import exercise.task_20.Shape;
import exercise.task_22.Fillable;

import java.util.Optional;

/**
 * Stwórz abstrakcyjną klasę Shape3D rozszerzającą klasę Shape z poprzedniego zadania.
 *
 * Dodaj dodatkową metodę calculateVolume().
 * Stwórz klasy Cone oraz Cube rozszerzając klasę Shape3D,
 * odpowiednio implementując metody abstrakcyjne.
 * Sprawdź poprawność działania.
 */

public abstract class Shape3D extends Shape implements Fillable {

    private Double volume;

    public abstract Double calculateVolume();

    protected Double cacheVolume(Double volume) {
        this.volume = volume;
        return volume;
    }

    public Optional<Double> getVolume() {
        return Optional.ofNullable(volume);
    }

    @Override
    public void fill(Double volume) {
        Double shapeVolume = calculateVolume();
        int result = Integer.signum(shapeVolume.compareTo(volume));
        switch (result) {
            case 0:
                System.out.println("shape is full");
                break;
            case -1:
                System.out.println("shape overflow");
                break;
            case 1:
                System.out.println("shape partially full");
                break;
        }
    }

}

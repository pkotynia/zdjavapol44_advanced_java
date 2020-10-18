package exercise.task_22;

/**
 * Stwórz interfejs Fillable posiadający metodę fill().
 * Zaimplementuj metodę w klasie Shape3D z poprzedniego zadania
 * lub osobno w klasach Cone oraz Cube.
 * Metoda fill() powinna przyjmować parametr double i sprawdzać, czy po,
 * akcji napełnienia figury:
 *
 * •wleje za dużo wody do figury i przeleje,
 * •napełni figurę wodą po brzegi,
 * •wleje za mało wody.
 *
 * Dla każdej sytuacji powinna zapisać informację o stanie w konsoli.
 *
 * Użyj metody calculateVolume().
 */

public interface Fillable {

    void fill(Double volume);

}

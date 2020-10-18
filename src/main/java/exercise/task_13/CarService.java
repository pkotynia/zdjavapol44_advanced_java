package exercise.task_13;

import exercise.task_12.Car;
import exercise.task_12.EngineType;
import exercise.task_12.Manufacturer;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stwórz klasę CarService, która będzie zawierać w sobie listę aut,
 * oraz będzie realizować poniższe metody:
 *
 * 1.dodawanie aut do listy,
 * 2.usuwanie auta z listy,
 * 3.zwracanie listy wszystkich aut,
 * 4.zwracanie aut z silnikiem V12,
 * 5.zwracanie aut wyprodukowanych przed rokiem 1999,
 * 6.zwracanie najdroższego auta,
 * 7.zwracanie najtańszego auta,
 * 8.sprawdzanie czy konkretne auto znajduje się na liście,
 * 9.zwracanie listy aut wyprodukowanych przez konkretnego producenta,
 *
 * Dodatkowe zadanie:
 *
 * Stworzyć generyczną metodę do wyszukiwania aut za pomocą predykatu
 */

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public List<Car> getAllCars(){
        return List.copyOf(cars);
    }

    public List<Car> getV12Cars() {
        return cars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfProduction().isBefore(Year.parse("1999")))
                .collect(Collectors.toList());
    }

    public Car getMostExpenciveCar() {
        return cars.stream()
                .max(Comparator.comparing(car -> car.getPrice()))
                .orElseThrow(NoSuchElementException::new);
    }

    public Car getLessExpenciveCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public boolean checkIfCarIsPresent(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByProducer(String producer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(producer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByPredicate(Predicate<Car> predicate) {
        return cars.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer vw = new Manufacturer("VW", Year.parse("1938"), "Germany");
        carService.addCar(new Car("Skoda", "Felicja", 18000, Year.parse("1998"), List.of(vw), EngineType.R4));
        carService.addCar(new Car("Skoda", "Octavia", 45000, Year.parse("2002"), List.of(vw), EngineType.R4));

        System.out.println("All cars: " + carService.getAllCars());

        System.out.println("Cars produced before 1999 " + carService.getCarsProducedBefore1999());
        System.out.println("Cars produced before 1999 " + carService.getCarsByPredicate(car -> car.getYearOfProduction().isBefore(Year.parse("1999"))));

    }
}

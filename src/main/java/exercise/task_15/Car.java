package exercise.task_15;

import exercise.task_09.Circle;
import exercise.task_09.Point2D;

/**
 * Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA,
 * itp. Każdy z pojazdów ma własne parametry: cena, moc.
 * Enum powinien zawierać metody boolean isPremium() oraz boolean isRegular().
 * Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().
 *
 * Dodatkowo w ramach klasy enum powinna być zadeklarowana
 * i zaimplementowana metoda boolean isFasterThan().
 *
 * Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o tym,
 * że wskazany pojazd jest szybszy bądź nie od pojazdu przekazanego w argumencie.
 * W tym celu skorzystaj z metody compareTo().
 */

// tell don't ask
public enum Car {

    FERRARI(1_000_000, 400, true),
    GOLF(1_500, 160, false);

    int price;
    int hp;
    boolean premium;

    Car(int price, int hp, boolean premium) {
        this.price = price;
        this.hp = hp;
        this.premium = premium;
    }

    boolean isPremium() {
        return premium;
    }

    boolean isRegular() {
        return !premium;
    }

    boolean isFasterThan(Car otherCar) {
        return this.hp > otherCar.hp;
    }

    public static void main(String[] args) {

        Car ferrari = Car.FERRARI;
        Car golf = Car.GOLF;

        System.out.println("Is golf a premium car " + golf.isPremium());
        System.out.println("Is ferrari faster than golf " + ferrari.isFasterThan(golf));


    }
}

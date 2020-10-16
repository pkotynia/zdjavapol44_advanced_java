package exercise.task_15;

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

public enum Car {

    FERRARI(1_000_000, 250, true),
    DAEWOO(1_500, 160, false);

    private int price;
    private Integer maxSpeed;
    private boolean premium;

    Car(int price, int maxSpeed, boolean premium) {
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public boolean isRegular() {
        return !premium;
    }

    public boolean isFasterThan(Car otherCar) {
        return this.maxSpeed.compareTo(otherCar.maxSpeed) > 0;
    }

    public static void main(String[] args) {

        Car nexia = DAEWOO;
        System.out.println("get price " + nexia.maxSpeed);
        System.out.println("is premium " + nexia.isPremium());
        System.out.println("is regular " + nexia.isRegular());

        System.out.println("is my nexia faster than ferrari " + nexia.isFasterThan(FERRARI));

    }
}

package exercise.task_17;

/**
 * Stwórz klasę enum ConversionType ze stałymi KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
 * Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
 * Następnie stwórz klasę MeasurementConverter, która będzie posiadała metodę
 * convert(int value, ConvertionType conversionType)
 *
 * i na podstawie przekazanej wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała wynik.
 */

public enum ConversionType {

    KILOMETERS_TO_MILES(new Converter(0.6214)),
    MILES_TO_KILOMETERS(new Converter(1.6093));

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public double convert(int value) {
        return converter.convert(value);
    }

    public static void main(String[] args) {
        ConversionType conversionType = ConversionType.KILOMETERS_TO_MILES;

        System.out.println(conversionType.convert(1));
    }
}

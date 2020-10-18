package exercise.task_12;

import java.time.Year;

/**
 * Stwórz klasęManufacturer, która będzie zawieraćpola: nazwa, rok założenia, kraj.
 * Uwzględnij wszystkie niezbędne meotody oraz parametry konstruktora.
 * Zaimplementuj metody hashCode()i equals().
 *
 * Stwórz klasę Car, która będzie zawieraćpola:
 * nazwa, model, cena, rok produkcji, lista producentów (Manufacturer),
 * oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, R6, R4, R3).
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora.
 * Zaimplementuj metody hashcode() i equals().
 */

public class Manufacturer {

    private String name;
    private Year yearOfEstablishment;
    private String country;

    public Manufacturer(String name, Year yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Year getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfEstablishment='" + yearOfEstablishment + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;

        Manufacturer that = (Manufacturer) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getYearOfEstablishment() != null ? !getYearOfEstablishment().equals(that.getYearOfEstablishment()) : that.getYearOfEstablishment() != null)
            return false;
        return getCountry() != null ? getCountry().equals(that.getCountry()) : that.getCountry() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getYearOfEstablishment() != null ? getYearOfEstablishment().hashCode() : 0);
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        return result;
    }
}

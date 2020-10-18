package exercise.task_12;

import java.time.Year;
import java.util.List;

public class Car {

    private String name;
    private String model;
    private Integer price;
    private Year yearOfProduction;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, Integer price, Year yearOfProduction, List<Manufacturer> manufacturers, EngineType engineeType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.manufacturers = manufacturers;
        this.engineType = engineeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Year yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getName() != null ? !getName().equals(car.getName()) : car.getName() != null) return false;
        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        if (getPrice() != null ? !getPrice().equals(car.getPrice()) : car.getPrice() != null) return false;
        if (getYearOfProduction() != null ? !getYearOfProduction().equals(car.getYearOfProduction()) : car.getYearOfProduction() != null)
            return false;
        if (getManufacturers() != null ? !getManufacturers().equals(car.getManufacturers()) : car.getManufacturers() != null)
            return false;
        return getEngineType() == car.getEngineType();

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getYearOfProduction() != null ? getYearOfProduction().hashCode() : 0);
        result = 31 * result + (getManufacturers() != null ? getManufacturers().hashCode() : 0);
        result = 31 * result + (getEngineType() != null ? getEngineType().hashCode() : 0);
        return result;
    }
}

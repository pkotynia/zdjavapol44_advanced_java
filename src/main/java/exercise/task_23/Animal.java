package exercise.task_23;

public class Animal {

    private String name;
    private Species species;

    public Animal(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {
        return species;
    }
}

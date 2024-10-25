public class Pet {
    private String name;
    private String species;

    // Konstruktor
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getter metodları
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    // toString metodunu yenidən müəyyən et
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}

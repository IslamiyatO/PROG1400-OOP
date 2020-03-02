package Inheritance.Animal;

public class Animal {
    // member variables
    protected String species;
    protected boolean hasFur;
    protected int numLegs;

    // mutator
    public void setSpecies(String species) {
        log("Changing species from " + this.species + "to " + species);
        this.species = species;
    }

    // accessor
    public String getSpecies() {
        return species;
    }

    public Animal() {
        this("Animal");
        log("Called no-arg constructor of Animal.");
    }

    public Animal(String species) {
        this(species, false, 2);
        log("Called one-arg constructor of Animal.");
    }

    public Animal(String species, boolean hasFur, int numLegs) {
        this.species = species;
        this.hasFur = hasFur;
        this.numLegs = numLegs;
        log("Called three-arg constructor of Animal.");
    }

    public void log(String str) {
        System.out.println(str);
    }
}

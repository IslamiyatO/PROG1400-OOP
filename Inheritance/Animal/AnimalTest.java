package Inheritance.Animal;

public class AnimalTest {

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.setSpecies("Canine");
        //dog.hasFur = true;
        //dog.numLegs = 4;

        Animal cat = new Animal();
        cat.setSpecies("Feline");
        //cat.hasFur = true;
        //cat.numLegs = 4;

        System.out.println("dog: " + dog.getSpecies());
        System.out.println("cat: " + cat.getSpecies());

        if (dog.getSpecies().equals(cat.getSpecies())) {
            System.out.println("The same species.");
        } else {
            System.out.println("NOT the same species.");
        }

        Mammal horse = new Mammal("Equine");

        System.out.println("horse: " + horse.getSpecies());

    }

}
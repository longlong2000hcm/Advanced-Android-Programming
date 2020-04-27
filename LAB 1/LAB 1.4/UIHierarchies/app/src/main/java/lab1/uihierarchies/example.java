package lab1.uihierarchies;

public class example {

    Animal dog1 = new Animal("dog", "Lu");

}

class Animal {
    //member data
    String animalSpecies, animalName;
    private String temporary;
    protected Integer age;
    public String hair_color;

    //member methods
    public Animal(String species, String name) {
        animalName = species;
        animalName = name;
    }
    public void speak() {
        String sentence = "I'm a " + this.animalSpecies + ", named " + animalName + ".";
        System.out.println(sentence);
    }
}

class Dog extends Animal implements Earthlings {
    public Dog(String species, String name) {
        super(species, name);
    }

    @Override
    public void speak() {
        System.out.println("Woff woff");
    }

    @Override
    public void breath() {
        System.out.println("Inhale, exhale");
    }

    @Override
    public void live() {
        System.out.println("Heart is beating");
    }
}

class Puppy extends Dog {

    public Puppy(String species, String name) {
        super(species, name);
    }
}

interface Earthlings {
    public void breath();
    public void live();
}

abstract class Feline {
    public void act() {
        System.out.println("Scratch");
    }
}

class Cat extends  Feline {
    //inherited act method
}
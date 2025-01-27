package Polymorphism ;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow moos.");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Cow();
        animal.makeSound();
    }
}

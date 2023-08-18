class Animal {

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    @Override void makeSound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Cat siamese = new Cat();
        siamese.makeSound();
    }
    
}

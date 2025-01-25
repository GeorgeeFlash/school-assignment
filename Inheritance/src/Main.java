public class Main {
    public static void main(String[] args) {
        // Demonstrating polymorphism through inheritance
        Animal dog = new Dog(); // Dog is treated as an Animal
        Animal cat = new Cat(); // Cat is treated as an Animal

        // Call the overridden makeSound methods
        dog.makeSound(); // Outputs: Bark
        cat.makeSound(); // Outputs: Meow
    }
}
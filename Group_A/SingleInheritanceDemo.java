class Animal {
    void speak() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof!");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak(); // Calling superclass method
        d.bark();  // Calling subclass method
    }
}

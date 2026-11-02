interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying in the sky.");
    }

    public void swim() {
        System.out.println("Duck is swimming in the pond.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        
        // Polymorphic references
        Flyable f = duck;
        Swimmable s = duck;
        
        f.fly();
        s.swim();
    }
}

class Animal {
    void sound() { System.out.println("Some animal sound"); }
}

class Horse extends Animal {
    @Override
    void sound() { System.out.println("Neigh"); }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Horse(); // Animal reference to Horse object
        a.sound(); // prints "Neigh" — runtime polymorphism
    }
}

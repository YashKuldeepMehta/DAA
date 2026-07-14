

// Derived class (Inheritance)
class Dog extends Animal {

    // Constructor
    Dog(String name) {
        super(name); // calling parent constructor
    }

    // Method Overriding
    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}

// Another derived class
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " meows");
    }
}

public class JavaLab8 {
    public static void main(String[] args) {

        Animal a = new Animal("Generic Animal");
        Dog d = new Dog("Buddy");
        Cat c = new Cat("Whiskers");

        a.display();
        a.sound();
        a.eat();
        a.eat("grass");

        System.out.println();

        d.display();
        d.sound(); // overridden method
        d.eat("bones");

        System.out.println();

        c.display();
        c.sound(); // overridden method
        c.eat("fish");
    }
}

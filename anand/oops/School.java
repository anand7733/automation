package com.anand.oops;

class School {
    public void display() {
        System.out.println("One");
    }
}

// Inheritance

class Students extends School {
    @Override
    public void display() {
        System.out.println("Army School");
    }

    public int add(int x, int y) {
        return x + y;
    }

    // Overloading

    public double add(double x, double y) {
        return x + y;
    }
}

// Encapsulation

class EncapTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

// Abstraction

abstract class TwoWheeler {
    public abstract void run();
}

class Honda extends TwoWheeler {
    @Override
    public void run() {
        System.out.println("Bike is Running");
    }
}

public class MainClass {
    public static void main(String[] args) {
        School a = new School();
        a.display();

        Students b = new Students();
        b.display();

        System.out.println(b.add(4, 2));
        System.out.println(b.add(5.0, 2.0));

        // Polymorphism

        EncapTest encap = new EncapTest();
        encap.setName("Anand Singh Rathore");

        System.out.println("Name: " + encap.getName());

        TwoWheeler test = new Honda();
        test.run();
    }
}

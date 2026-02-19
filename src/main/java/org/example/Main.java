package org.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Alice", "Smith", 15);
        Person person3 = new Person("Bob", "Brown", 18, "Male", "bob@mail.com", true);

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        System.out.println("-------------------------");

        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("Is Teen: " + person2.isTeen());

        System.out.println("-------------------------");

        System.out.println("Lastname: " + person3.getLastName());
        System.out.println("Age: " + person3.getAge());

        System.out.println("-------------------------");

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
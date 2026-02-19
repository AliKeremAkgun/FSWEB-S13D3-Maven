package org.example;

public class Person {

    //Instance variables
    String firstName;
    String lastName;
    int age;

    String gender;
    String email;
    boolean isStudent;

    // Constructor 1
    public Person(String firstname, String lastname, int age) {
        this(firstname, lastname, age, "Unknown", "unknown@mail.com", false);
    }

    // Constructor 2 (Overloading + Constructor Chaining)
    public Person(String firstName, String lastName, int age, String gender, String email, boolean isStudent) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.isStudent = isStudent;
    }

    //Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }
}
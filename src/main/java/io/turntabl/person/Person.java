package io.turntabl.person;

public class Person {

    private String name;
    private String niNumber;

    public Person(String name, String niNumber) {
        this.name = name;
        this.niNumber = niNumber;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }
}

package io.turntabl.person;

public class Person {

    private String name;
    private int niNumber;

    public Person(String name, int niNumber) {
        this.name = name;
        this.niNumber = niNumber;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }
}

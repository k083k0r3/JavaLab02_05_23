package io.turntabl.vehicle.motorbike;

import io.turntabl.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ScooterTest {

    Scooter scooter;

    @BeforeEach
    void setUp(){
        ArrayList<Person> owners = new ArrayList<>();
        Person person = new Person("Gerald", "859874");
        owners.add(person);
        scooter = new Scooter("M 657-22", owners);
    }

    @Test
    void testScooterCharge(){
        Person person = new Person("Kobe", "9847539");
        scooter.addOwner(person);
        assertEquals(7.0, scooter.calcCharge());
    }

}
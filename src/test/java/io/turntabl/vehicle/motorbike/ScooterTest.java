package io.turntabl.vehicle.motorbike;

import io.turntabl.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScooterTest {

    Scooter scooter;

    @BeforeEach
    void setUp(){
        Person person = new Person("Gerald", 859874);
        scooter = new Scooter("M 657-22", person);
    }

    @Test
    void testScooterCharge(){
        Person person = new Person("Kobe", 9847539);
        scooter.addOwner(person);
        assertEquals(7.0, scooter.calcCharge());
    }

}
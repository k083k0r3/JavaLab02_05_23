package io.turntabl.vehicle.motorbike;

import io.turntabl.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LargerMotorBikeTest {

    LargerMotorBike largerMotorBike;
    ArrayList<Person> owners;

    @BeforeEach
    void setUp(){
        owners = new ArrayList<>();
        Person person = new Person("Mark", "256378");
        largerMotorBike = new LargerMotorBike("M 132-23", owners);
    }

    @Test
    void testLargerMotorBikeCharge(){
        assertEquals(10.0, largerMotorBike.calcCharge());
    }
}
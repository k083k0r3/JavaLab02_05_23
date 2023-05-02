package io.turntabl.vehicle.motorbike;

import io.turntabl.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargerMotorBikeTest {

    LargerMotorBike largerMotorBike;

    @BeforeEach
    void setUp(){
        Person person = new Person("Mark", 256378);
        largerMotorBike = new LargerMotorBike("M 132-23", person);
    }

    @Test
    void testLargerMotorBikeCharge(){
        assertEquals(largerMotorBike.getParkingCharge(), largerMotorBike.calcCharge());
    }

}
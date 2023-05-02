package io.turntabl.vehicle;
import io.turntabl.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrivateUseCarTest {
    PrivateUseCar privateUseCar;
    @BeforeEach
    void setUp(){
        Person person = new Person("Emma", 78358293);
        privateUseCar = new PrivateUseCar("GT 4570-19", person);
    }
    @Test
    void testCalcChargePrivateUseBuilding(){
        assertEquals(privateUseCar.getParkingCharge(), privateUseCar.calcCharge());
    }

}
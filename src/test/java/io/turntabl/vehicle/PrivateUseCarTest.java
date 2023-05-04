package io.turntabl.vehicle;
import io.turntabl.person.Person;
import io.turntabl.towncouncil.TownCouncil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PrivateUseCarTest {

    private PrivateUseCar privateUseCar;
    private Person person;
    private ArrayList<Person> owners;

    @BeforeEach
    void setUp(){
        owners = new ArrayList<>();
        person = new Person("Emma", "78358293");
        owners.add(person);
        privateUseCar = new PrivateUseCar("GT 4570-19", owners);
    }

    @Test
    void testCalcChargePrivateUseCarSingleOwner(){
        //given
        assertEquals(20.0, privateUseCar.calcCharge());
    }

    @Test
    void testCalcChargePrivateUseCarMultipleOwners(){
        //given
        Person person = new Person("Kobe", "9430495");
        owners.add(person);
        //when
        double charge = privateUseCar.calcCharge();
        assertEquals(40.0, charge);
    }
}
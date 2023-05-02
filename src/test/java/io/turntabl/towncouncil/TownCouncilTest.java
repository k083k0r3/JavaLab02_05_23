package io.turntabl.towncouncil;

import io.turntabl.exception.PermitAlreadyIssuedException;
import io.turntabl.exception.UserNotAuthorisedException;
import io.turntabl.person.Person;
import io.turntabl.vehicle.PrivateUseCar;
import io.turntabl.vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TownCouncilTest {
    TownCouncil townCouncil;

    @BeforeEach
    void setUp(){
        townCouncil = new TownCouncil();
    }

    @Test
    void testValidatePermitDoesNotThrowException(){
        assertDoesNotThrow(() -> {
            Person person = new Person("Dufie", 738462);
            Vehicle vehicle = new PrivateUseCar("GR 456-23", person);
            townCouncil.validatePermit(person, vehicle);
        });
    }

    @Test
    void testIssueParkingPermitDoesNotThrowPermitAlreadyIssued(){
        assertThrows(PermitAlreadyIssuedException.class, () -> {
            Person person1 = new Person("Mark", 8384234);
            Vehicle vehicle = new PrivateUseCar("GR 456-23", person1);
            townCouncil.validatePermit(person1, vehicle);
            townCouncil.issueParkingPermit(person1, vehicle);
        });
    }

    @Test
    void testValidatePermitThrowsUserNotPermitted(){
        assertThrows(UserNotAuthorisedException.class, () -> {
            Person person1 = new Person("Mark", 8384234);
            Person person = new Person("Dufie",738462);
            Vehicle vehicle = new PrivateUseCar("GR 456-23", person1);
            townCouncil.validatePermit(person, vehicle);
        });
    }

}
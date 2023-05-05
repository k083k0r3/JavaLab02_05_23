package io.turntabl.vehicle;
import io.turntabl.exception.InvalidWeightException;
import io.turntabl.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BuildingSitesVehicleTest {

    private Person person;
    private ArrayList<Person> owners;
    @BeforeEach
    void setUp(){
        owners = new ArrayList<>();
        person = new Person("Rose", "8473985");
    }

    @Test
    void testCalcChargeBuildingSitesVehicleOver150SingleOwner() throws InvalidWeightException {
        owners.add(person);
        BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", 175.0, owners);
        assertEquals(40, buildingSitesVehicle.calcCharge());
    }

    @Test
    void testCalcChargeBuildingSitesVehicleOver150MultipleOwners() throws InvalidWeightException {
        owners.add(person);
        Person person = new Person("Kobe", "7864539");
        owners.add(person);
        BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", 175.0, owners);
        assertEquals(40, buildingSitesVehicle.calcCharge());
    }

    @Test
    void testCalcChargeBuildingSitesVehicleUnder150SingleOwner() throws InvalidWeightException {
        owners.add(person);
        BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", 95.0, owners);
        assertEquals(30.0, buildingSitesVehicle.calcCharge());
    }

    @Test
    void testCalcChargeBuildingSitesVehicleUnder150MultipleOwner() throws InvalidWeightException {
        owners.add(person);
        Person person = new Person("Dufie", "21874612");
        owners.add(person);
        BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", 95.0, owners);
        assertEquals(30.0, buildingSitesVehicle.calcCharge());
    }

    @Test
    void testThrowsInvalidWeightException(){
        assertThrows(InvalidWeightException.class, () -> {
            owners.add(person);
            BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", -30, owners);
        });
    }
}
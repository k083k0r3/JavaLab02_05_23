package io.turntabl.vehicle;
import io.turntabl.exception.InvalidWeightException;
import io.turntabl.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuildingSitesVehicleTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person("Rose", 8473985);
    }

    @Test
    void testCalcChargeBuildingSitesVehicleOver150() throws InvalidWeightException {
        BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", 175.0, person);
        Person person = new Person("Kobe", 7864539);
        buildingSitesVehicle.addOwner(person);
        assertEquals(80, buildingSitesVehicle.calcCharge());
    }

    @Test
    void testCalcChargeBuildingSitesVehicleUnder150() throws InvalidWeightException {
        BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", 95.0, person);
        assertEquals(buildingSitesVehicle.getBaseCharge(), buildingSitesVehicle.calcCharge());
    }

    @Test
    void testThrowsInvalidWeightException(){
        assertThrows(InvalidWeightException.class, () -> {
            BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GR 4325-16", -30, person);
        });
    }
}
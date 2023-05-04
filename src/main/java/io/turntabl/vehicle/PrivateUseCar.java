package io.turntabl.vehicle;
import io.turntabl.person.Person;
import io.turntabl.vehicletype.VehicleType;

import java.util.ArrayList;

public class PrivateUseCar extends Vehicle{
    private final double parkingCharge = 20.0;

    public PrivateUseCar(String numberPlate, ArrayList<Person> owners) {
        super(numberPlate, VehicleType.PRIVATE, owners);
    }

    @Override
    public double calcCharge() {
        return (getOwners().size()) * parkingCharge;
    }
}

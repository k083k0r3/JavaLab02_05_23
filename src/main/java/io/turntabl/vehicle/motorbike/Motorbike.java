package io.turntabl.vehicle.motorbike;

import io.turntabl.person.Person;
import io.turntabl.vehicle.Vehicle;
import io.turntabl.vehicletype.VehicleType;

import java.util.ArrayList;

public abstract class Motorbike extends Vehicle {

    public Motorbike(String numberPlate, ArrayList<Person> owners) {
        super(numberPlate, VehicleType.MOTORBIKE, owners);
    }

    @Override
    public abstract double calcCharge();
}

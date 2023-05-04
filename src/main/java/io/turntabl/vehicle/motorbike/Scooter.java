package io.turntabl.vehicle.motorbike;
import io.turntabl.person.Person;

import java.util.ArrayList;

public class Scooter extends Motorbike{
    private final double parkingCharge = 7.0;
    public Scooter(String numberPlate, ArrayList<Person> owners) {
        super(numberPlate, owners);

    }

    @Override
    public double calcCharge() {
        return parkingCharge;
    }
}

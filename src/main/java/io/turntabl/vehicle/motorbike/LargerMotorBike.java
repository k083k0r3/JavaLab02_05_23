package io.turntabl.vehicle.motorbike;
import io.turntabl.person.Person;

import java.util.ArrayList;

public class LargerMotorBike extends Motorbike{

    private final double parkingCharge = 10.0;

    public LargerMotorBike(String numberPlate, ArrayList<Person> owners) {
        super(numberPlate, owners);
    }


    @Override
    public double calcCharge() {
        return parkingCharge;
    }
}

package io.turntabl.vehicle.motorbike;
import io.turntabl.person.Person;

public class LargerMotorBike extends Motorbike{

    private final double parkingCharge = 10.0;

    public LargerMotorBike(String numberPlate, Person person) {
        super(numberPlate, person);
    }

    public double getParkingCharge() {
        return parkingCharge;
    }

    @Override
    public double calcCharge() {
        return parkingCharge;
    }
}

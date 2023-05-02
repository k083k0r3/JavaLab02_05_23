package io.turntabl.vehicle.motorbike;
import io.turntabl.person.Person;

public class Scooter extends Motorbike{
    private final double parkingCharge = 7.0;
    public Scooter(String numberPlate, Person person) {
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

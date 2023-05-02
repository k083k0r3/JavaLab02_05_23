package io.turntabl.vehicle;
import io.turntabl.person.Person;
import io.turntabl.vehicletype.VehicleType;

public class PrivateUseCar extends Vehicle{
    private final double parkingCharge = 20.0;

    public PrivateUseCar(String numberPlate, Person person) {
        super(numberPlate, VehicleType.PRIVATE, person);
    }

    @Override
    public double calcCharge() {
        return (getOwners().size()) * parkingCharge;
    }



}

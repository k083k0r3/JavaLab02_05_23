package io.turntabl.vehicle;
import io.turntabl.person.Person;
import io.turntabl.vehicletype.VehicleType;

public class PrivateUseCar extends Vehicle{
    private final double parkingCharge = 20.0;
    private boolean isPermitted;
    public PrivateUseCar(String numberPlate, Person person) {
        super(numberPlate, VehicleType.PRIVATE, person);
        this.isPermitted = false;
    }

    @Override
    public double calcCharge() {
        return parkingCharge;
    }

    public double getParkingCharge() {
        return parkingCharge;
    }

    public boolean isPermitted() {
        return isPermitted;
    }
}

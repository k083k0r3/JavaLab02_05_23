package io.turntabl.vehicle;
import io.turntabl.exception.InvalidWeightException;
import io.turntabl.person.Person;
import io.turntabl.vehicletype.VehicleType;

import java.util.ArrayList;


public class BuildingSitesVehicle extends Vehicle{

    private final double baseCharge = 30.0;
    private final double extraCharge = 5.0;
    private final double weight;
    public BuildingSitesVehicle(String numberPlate, double weight, ArrayList<Person> owners) throws InvalidWeightException {
        super(numberPlate, VehicleType.BUILDING, owners);
        if(weight > 0) {
            this.weight = weight;
        } else {
            throw new InvalidWeightException("Invalid Value for weight");
        }
    }

    @Override
    public double calcCharge() {
        if(weight - 150 <= 0){
            return (getOwners().size()) * baseCharge;
        } else {
            double diff = weight - 150;
            double multiplier = (Math.ceil(diff /20.0));
            return (baseCharge + (multiplier * extraCharge));
        }
    }

    public double getBaseCharge() {
        return baseCharge;
    }
}

package io.turntabl.towncouncil;
import io.turntabl.exception.PermitAlreadyIssuedException;
import io.turntabl.exception.UserNotAuthorisedException;
import io.turntabl.person.Person;
import io.turntabl.vehicle.Vehicle;
import io.turntabl.vehicletype.VehicleType;
import java.util.HashMap;
import java.util.Map;

public class TownCouncil {

    Vehicle vehicle;
    Map<Vehicle, Integer> parkingPermitsIssued;


    public TownCouncil() {
        parkingPermitsIssued = new HashMap<>();
    }

    public void validatePermit(Person person, Vehicle vehicle) throws UserNotAuthorisedException, PermitAlreadyIssuedException {

            if(vehicle.getOwners().contains(person)){
                issueParkingPermit(person, vehicle);
            } else {
                throw new UserNotAuthorisedException("User: " + person.getName() + " not Among Owners");
            }
    }

    public void issueParkingPermit(Person person, Vehicle vehicle) throws PermitAlreadyIssuedException {
        if(parkingPermitsIssued.containsKey(vehicle)){
            throw new PermitAlreadyIssuedException("Permit has already been Issued");
        }
        parkingPermitsIssued.put(vehicle, person.getNiNumber());
    }

}

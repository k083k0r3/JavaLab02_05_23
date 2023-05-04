package io.turntabl.towncouncil;
import io.turntabl.exception.PermitAlreadyIssuedException;
import io.turntabl.exception.UserNotAuthorisedException;
import io.turntabl.permitissueservice.PermitIssuerService;
import io.turntabl.person.Person;
import io.turntabl.vehicle.Vehicle;
import io.turntabl.vehicletype.VehicleType;
import io.turntabl.verificationservice.VerificationService;

import java.util.HashMap;
import java.util.Map;


public class TownCouncil{
    private final VerificationService verificationservice;
    private final PermitIssuerService permitIssuerService;
    private Map<Vehicle, String> parkingPermitsIssued;


    public TownCouncil(VerificationService verificationservice, PermitIssuerService permitIssuerService) {
        this.verificationservice = verificationservice;
        this.permitIssuerService = permitIssuerService;
        parkingPermitsIssued = new HashMap<>();
    }

    //Dont return NumberPlate
    //Return Ni Number / Create Permit Number
    protected String issueParkingPermit(Vehicle vehicle, Person person) throws PermitAlreadyIssuedException, UserNotAuthorisedException {
        validatePermit(vehicle, person);
        if(parkingPermitsIssued.containsKey(vehicle)){
            throw new PermitAlreadyIssuedException("Permit has already been Issued to " + vehicle.getNumberPlate());
        }else if(vehicle.getVehicleType().equals(VehicleType.BUILDING)) {
            this.issuePermit(vehicle, person);
        }
        permitIssuerService.issuePermit(vehicle);
        issuePermit(vehicle, person);
        return (vehicle.getNumberPlate());
    }

    private void validatePermit(Vehicle vehicle, Person person) throws UserNotAuthorisedException {
            if(!verificationservice.verifyPerson(person, vehicle)){
                throw new UserNotAuthorisedException("User: " + person.getName() + " not Among Owners");
            }
    }

    private String issuePermit(Vehicle vehicle, Person person) {
        parkingPermitsIssued.put(vehicle, person.getNiNumber());
        return person.getNiNumber();
    }







// redo this keep count when you issue the permit.
    public int countVehicleType (VehicleType vehicleType){
        int res = 0;
        for(Vehicle vehicle: parkingPermitsIssued.keySet()){
            if (vehicle.getVehicleType().equals(vehicleType)){
                res++;
            }
        }
        return res;
    }

}






























//        if(parkingPermitsIssued.containsKey(v)){
//            System.out.println("Permit has already been Issued");
//        }
//        parkingPermitsIssued.put(v, person.getNiNumber());
//        vehicle.setHasPermit(true);
//
//        return null;







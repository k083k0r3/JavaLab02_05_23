package io.turntabl.permitissueservice;

import io.turntabl.person.Person;
import io.turntabl.vehicle.Vehicle;

public interface PermitIssuerService {

    //Remember to remove the Person parameter
    String issuePermit(Vehicle v);
}

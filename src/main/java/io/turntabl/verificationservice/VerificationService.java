package io.turntabl.verificationservice;

import io.turntabl.person.Person;
import io.turntabl.vehicle.Vehicle;

public interface VerificationService {
    boolean verifyPerson(Person p, Vehicle v);
}

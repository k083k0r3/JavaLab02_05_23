package io.turntabl.towncouncil;

import io.turntabl.exception.InvalidWeightException;
import io.turntabl.exception.PermitAlreadyIssuedException;
import io.turntabl.exception.UserNotAuthorisedException;
import io.turntabl.permitissueservice.PermitIssuerService;
import io.turntabl.person.Person;
import io.turntabl.vehicle.BuildingSitesVehicle;
import io.turntabl.vehicle.PrivateUseCar;
import io.turntabl.vehicle.Vehicle;
import io.turntabl.vehicle.motorbike.LargerMotorBike;
import io.turntabl.vehicletype.VehicleType;
import io.turntabl.verificationservice.VerificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TownCouncilTest {
    @Mock
    VerificationService verificationService;
    @Mock
    PermitIssuerService permitIssuerService;
    TownCouncil townCouncil;
    ArrayList<Person> owners;

    @BeforeEach
    void setUp(){
        owners = new ArrayList<>();
        townCouncil = new TownCouncil(verificationService, permitIssuerService);
    }

    @Test
    void testIssueParkingPermitThrowsUserNotAuthorisedException(){
        //Given
        Person notOwner = new Person("Mark", "874534");
        Person person = new Person("Kobe", "876382");
        PrivateUseCar privateUseCar = new PrivateUseCar("GT 7897-13", owners);
        when(verificationService.verifyPerson(notOwner, privateUseCar)).thenReturn(false);
        assertThrows(UserNotAuthorisedException.class, () -> {
            //when
            townCouncil.issueParkingPermit(privateUseCar, notOwner);
        });
    }

    @Test
    void testIssueParkingPermitThrowsPermitAlreadyIssuedException(){
        //Given
        Person person = new Person("Ri", "87687687");
        owners.add(person);
        PrivateUseCar privateUseCar = new PrivateUseCar("GE 765578-23", owners);
        when(verificationService.verifyPerson(person, privateUseCar)).thenReturn(true);
        assertThrows(PermitAlreadyIssuedException.class, () -> {
            //when
            townCouncil.issueParkingPermit(privateUseCar, person);
            townCouncil.issueParkingPermit(privateUseCar, person);
        });
    }

//    @Test
//    void testIssuePermitForBuildingVehiclesDoesNotUseInterface() throws InvalidWeightException, UserNotAuthorisedException, PermitAlreadyIssuedException {
//        //Given
//        Person person = new Person("Mark", "98798");
//        owners.add(person);
//        BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GY 898-20", 90, owners);
//        when(verificationService.verifyPerson(person, buildingSitesVehicle)).thenReturn(true);
//
//        //when
//
//
//    }

}
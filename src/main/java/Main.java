import io.turntabl.exception.InvalidWeightException;
import io.turntabl.exception.PermitAlreadyIssuedException;
import io.turntabl.exception.UserNotAuthorisedException;
import io.turntabl.person.Person;
import io.turntabl.towncouncil.TownCouncil;
import io.turntabl.vehicle.BuildingSitesVehicle;
import io.turntabl.vehicle.PrivateUseCar;
import io.turntabl.vehicle.motorbike.LargerMotorBike;
import io.turntabl.vehicletype.VehicleType;

public class Main {
    public static void main(String[] args) throws UserNotAuthorisedException, PermitAlreadyIssuedException {
//        //First Car
//        Person dufie = new Person("Dufie", 643587495);
//        PrivateUseCar privateUseCar = new PrivateUseCar("GT 6754-23", dufie);
//        TownCouncil tc2 = new TownCouncil();
//        tc2.validatePermit(dufie, privateUseCar);
//
//        //Second Car
//        Person kobe = new Person("Kobe", 98798237);
//        try {
//            BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GV 759-23", 90, kobe);
//            TownCouncil tc1 = new TownCouncil();
//            System.out.println(buildingSitesVehicle.getHasPermit());
//            tc1.validatePermit(kobe, buildingSitesVehicle);
//            System.out.println(buildingSitesVehicle.getHasPermit());
//        } catch (InvalidWeightException e){
//            System.out.println("Weight is Invalid");
//        }
//
//        Person mark = new Person("Mark", 98798237);
//        try {
//            BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GV 759-23", 90, mark);
//            TownCouncil tc1 = new TownCouncil();
//            System.out.println(buildingSitesVehicle.getHasPermit());
//            tc1.validatePermit(mark, buildingSitesVehicle);
//            System.out.println(buildingSitesVehicle.getHasPermit());
//        } catch (InvalidWeightException e){
//            System.out.println("Weight is Invalid");
//        }
//
//
//        System.out.println();
//        System.out.println();
//
//        TownCouncil tc1 = new TownCouncil();
//
//        Person emma = new Person("Emma", 8937343);
//        LargerMotorBike largerMotorBike = new LargerMotorBike("M 749-12", emma);
//        tc1.validatePermit(emma, largerMotorBike);
//
//        Person gerald = new Person("Gerald", 8937343);
//        LargerMotorBike largerMotorBike1 = new LargerMotorBike("M 749-12", gerald);
//        tc1.validatePermit(gerald, largerMotorBike1);
//
//        Person elisha = new Person("Elisha", 8937343);
//        LargerMotorBike largerMotorBike2 = new LargerMotorBike("M 749-12", elisha);
//        tc1.validatePermit(elisha, largerMotorBike2);
//
//        Person majid = new Person("Majid", 8937343);
//        LargerMotorBike largerMotorBike3 = new LargerMotorBike("M 749-12", majid);
//        tc1.validatePermit(majid, largerMotorBike3);
//
//        Person rose = new Person("Rose", 8937343);
//        LargerMotorBike largerMotorBike4 = new LargerMotorBike("M 749-12", rose);
//        tc1.validatePermit(rose, largerMotorBike4);
//
//        Person zenas = new Person("Emma", 8937343);
//        LargerMotorBike largerMotorBike5 = new LargerMotorBike("M 749-12", zenas);
//        tc1.validatePermit(zenas, largerMotorBike5);
//
//        System.out.println(tc1.countVehicleType(VehicleType.MOTORBIKE));
//        System.out.println(tc2.countVehicleType(VehicleType.PRIVATE));

//        System.out.println(privateUseCar.getHasPermit());
//        TownCouncil tc = new TownCouncil();
//
//
//        try {
//            tc.validatePermit(person, privateUseCar);
//        } catch (UserNotAuthorisedException e){
//            throw new RuntimeException(e);
//        } catch (PermitAlreadyIssuedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(privateUseCar.getHasPermit());
    }
}

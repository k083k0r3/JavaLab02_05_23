import io.turntabl.exception.InvalidWeightException;
import io.turntabl.exception.PermitAlreadyIssuedException;
import io.turntabl.exception.UserNotAuthorisedException;
import io.turntabl.person.Person;
import io.turntabl.towncouncil.TownCouncil;
import io.turntabl.vehicle.BuildingSitesVehicle;
import io.turntabl.vehicle.PrivateUseCar;

public class Main {
    public static void main(String[] args) throws UserNotAuthorisedException, PermitAlreadyIssuedException {
        Person person = new Person("Dufie", 643587495);
        Person person1 = new Person("Kobe", 98798237);
        Person person2 = new Person("Emma", 98798237);
        PrivateUseCar privateUseCar = new PrivateUseCar("GT 6754-23", person);
        try {
            BuildingSitesVehicle buildingSitesVehicle = new BuildingSitesVehicle("GV 759-23", 90, person1);
            TownCouncil tc1 = new TownCouncil();
            System.out.println(buildingSitesVehicle.getHasPermit());
            tc1.validatePermit(person1, buildingSitesVehicle);
            System.out.println(buildingSitesVehicle.getHasPermit());
        } catch (InvalidWeightException e){
            System.out.println("Weight is Invalid");
        }


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

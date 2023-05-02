import io.turntabl.exception.PermitAlreadyIssuedException;
import io.turntabl.exception.UserNotAuthorisedException;
import io.turntabl.person.Person;
import io.turntabl.towncouncil.TownCouncil;
import io.turntabl.vehicle.PrivateUseCar;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dufie", 643587495);
        Person person1 = new Person("Kobe", 98798237);
        Person person2 = new Person("Emma", 98798237);
        PrivateUseCar privateUseCar = new PrivateUseCar("GT 6754-23", person);
        privateUseCar.addOwner(person1);
        TownCouncil tc = new TownCouncil();

        try {
            tc.validatePermit(person, privateUseCar);
            tc.validatePermit(person1, privateUseCar);
        } catch (UserNotAuthorisedException e){
            throw new RuntimeException(e);
        } catch (PermitAlreadyIssuedException e) {
            throw new RuntimeException(e);
        }
    }
}

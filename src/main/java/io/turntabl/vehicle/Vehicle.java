package io.turntabl.vehicle;

import io.turntabl.person.Person;
import io.turntabl.vehicletype.VehicleType;

import java.util.ArrayList;

public abstract class Vehicle {

    private final String numberPlate;
    private final
    ArrayList<Person> owners;
    private final VehicleType vehicleType;

    public Vehicle(String numberPlate, VehicleType vehicleType, ArrayList<Person> owners) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
        this.owners = owners;
    }


    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void addOwner(Person person){
        getOwners().add(person);
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public abstract double calcCharge();
}

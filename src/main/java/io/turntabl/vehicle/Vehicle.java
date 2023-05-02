package io.turntabl.vehicle;

import io.turntabl.person.Person;
import io.turntabl.vehicletype.VehicleType;

import java.util.ArrayList;

public abstract class Vehicle {

    private final String numberPlate;
    private final
    ArrayList<Person> owners;
    private final VehicleType vehicleType;
    private boolean hasPermit;

    public Vehicle(String numberPlate, VehicleType vehicleType, Person person) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
        owners = new ArrayList<>();
        owners.add(person);
    }


    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void addOwner(Person person){
        getOwners().add(person);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberPlate='" + numberPlate + '\'' +
                ", owners=" + owners +
                ", vehicleType=" + vehicleType +
                '}';
    }

    public boolean getHasPermit() {
        return hasPermit;
    }

    public void setHasPermit(boolean hasPermit) {
        this.hasPermit = hasPermit;
    }

    //    public void listOwners(){
//        for(Person entry: owners){
//            System.out.println(entry.getName());
//        }
//    }

//    public VehicleType getVehicleType() {
//        return vehicleType;
//    }

    public abstract double calcCharge();
}

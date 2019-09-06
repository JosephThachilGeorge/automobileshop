package model.service;

import model.service.imp.Servicevehicletype;

import java.util.Scanner;

public class Servicevehicle {

    private Servicevehicletype type;
    private String vehiclename;
    private String vehiclemodelnumber;
    private String problemdescription;

    public Servicevehicletype getType() {
        return type;
    }

    public void setType(Servicevehicletype type) {
        this.type = type;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getVehiclemodelnumber() {
        return vehiclemodelnumber;
    }

    public void setVehiclemodelnumber(String vehiclemodelnumber) {
        this.vehiclemodelnumber = vehiclemodelnumber;
    }

    public String getProblemdescription() {
        return problemdescription;
    }

    public void setProblemdescription(String problemdescription) {
        this.problemdescription = problemdescription;
    }

    public void addVehicle(Servicevehicletype type){
        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println(String.format("Enter %s Name:",type));
        String vehiclename = commandLineScanner.nextLine();
        System.out.println(String.format("Enter %s  Model Number:",type));
        String vehiclemodelnumber = commandLineScanner.nextLine();
        System.out.println(String.format("Enter %s  Problem Description:",type));
        String problemdescription = commandLineScanner.nextLine();

        this.setType(type);
        this.setVehiclename(vehiclename);
        this.setVehiclemodelnumber(vehiclemodelnumber);
        this.setProblemdescription(problemdescription);
        System.out.println("Thank You!. Information Stored!");
    }

}

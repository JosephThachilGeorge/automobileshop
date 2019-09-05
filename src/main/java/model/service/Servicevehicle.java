package model.service;

import model.service.imp.Servicevehicletype;

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
}

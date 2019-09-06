package model.service;

import model.service.imp.Servicevehicletype;

public interface Serviceinfo {

    void calculatecost();
    void display();
    void expecteddeliverydate();
    void discount();


    Servicevehicle addServicevehicle();
    void deleteServicevehicle();
    void updateServicevehicle();

    String getVehiclename();
    void setVehiclename(String vehiclename);

    String getVehiclemodelnumber();
    void setVehiclemodelnumber(String vehiclemodelnumber);

    String getProblemdescription();
    void setProblemdescription(String problemdescription);

    Servicevehicletype getType();
    void setType(Servicevehicletype type);

}

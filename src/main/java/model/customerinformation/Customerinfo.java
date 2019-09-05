package model.customerinformation;

import model.purchase.Purchasevehicle;
import model.service.Servicevehicle;

import java.util.List;

public interface Customerinfo {

    void addcustomer();
    void displaycustomer();
    void deletecustomer();
    void updatecustomer();

    String getFname();
    void setFname(String fname);

    String getLname();
    void setLname(String lname);

    String getCusId();
    void setCusId(String cusId);

    String getMobilenumber();
    void setMobilenumber(String mobilenumber);

    List<Servicevehicle> getVehicles();

    void setVehicles(List<Servicevehicle> vehicles);

    List<Purchasevehicle> getPvehicles();

    void setPvehicles(List<Purchasevehicle> pvehicles);

}

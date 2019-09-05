package model.customerinformation;

import database.Database;
import model.purchase.Purchasevehicle;
import model.service.Servicevehicle;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Customerinformation implements Customerinfo {

    private String fname;
    private String lname;
    private String cusId;
    private String mobilenumber;
    private List<Servicevehicle> vehicles;
    private List<Purchasevehicle> pvehicles;


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public List<Servicevehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Servicevehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Purchasevehicle> getPvehicles() {
        return pvehicles;
    }

    public void setPvehicles(List<Purchasevehicle> pvehicles) {
        this.pvehicles = pvehicles;
    }

    public void addServiceVehicle(Servicevehicle servicevehicle) {

        if(this.vehicles == null){
            this.vehicles = new ArrayList<Servicevehicle>();
        }
        this.vehicles.add(servicevehicle);
    }

    public void removeServiceVehicle(String vehiclemodelnumber){
        if(this.vehicles != null || this.vehicles.size() > 0) {
            this.vehicles.removeIf(p -> vehiclemodelnumber.equalsIgnoreCase(p.getVehiclemodelnumber()));
        }
    }

    public void addPurchaseVehicle(Purchasevehicle purchasevehicle) {

        if(this.pvehicles == null){
            this.pvehicles = new ArrayList<Purchasevehicle>();
        }
        this.pvehicles.add(purchasevehicle);
    }

    public void removePurchaseVehicle(String pmodelnumber){
        if(this.pvehicles != null || this.pvehicles.size() > 0) {
            this.pvehicles.removeIf(p -> pmodelnumber.equalsIgnoreCase(p.getPmodelnumber()));
        }
    }


    @Override
    public void addcustomer() {

        Customerinformation customerinformation=new Customerinformation();
        Database database=new Database();
        Scanner commandLineScanner = new Scanner(System.in);

        System.out.println("Enter Customer First Name:");
        commandLineScanner.nextLine();  //this will print each line
        String fname = commandLineScanner.nextLine();
        System.out.println("Enter Customer Last Name:");
        String lname = commandLineScanner.nextLine();
        System.out.println("Enter Customer ID:");
        String cusid = commandLineScanner.nextLine();
        System.out.println("Enter Customer Mobile Number:");
        String cusmobilenumber = commandLineScanner.nextLine();

        customerinformation.setFname(fname);
        customerinformation.setLname(lname);
        customerinformation.setCusId(cusid);
        customerinformation.setMobilenumber(cusmobilenumber);

        database.addCustomer(customerinformation);

        System.out.println("Enter Your VEHICLE Type: 1: FOR CAR:  2: FOR VAN  3: FOR MOTORBIKE!");

        }

   @Override
    public void displaycustomer() {

    }

    @Override
    public void deletecustomer() {

    }

    @Override
    public void updatecustomer() {

    }
}

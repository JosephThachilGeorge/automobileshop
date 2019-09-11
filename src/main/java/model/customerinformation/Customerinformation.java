package model.customerinformation;

import database.Database;
import model.purchase.Purchasevehicle;
import model.service.*;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;
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
        Scanner commandLineScanner = new Scanner(System.in);

        System.out.println("Enter Customer First Name:");
        String fname = commandLineScanner.nextLine();
        System.out.println("Enter Customer Last Name:");
        String lname = commandLineScanner.nextLine();
        System.out.println("Enter Customer ID:");
        String cusid = commandLineScanner.nextLine();
        System.out.println("Enter Customer Mobile Number:");
        String cusmobilenumber = commandLineScanner.nextLine();

        this.setFname(fname);
        this.setLname(lname);
        this.setCusId(cusid);
        this.setMobilenumber(cusmobilenumber);
        this.vehicles = new ArrayList<>();
        this.pvehicles = new ArrayList<>();

        System.out.println("Enter Your VEHICLE Type: 1: FOR CAR:  2: FOR VAN  3: FOR MOTORBIKE!");
        int CHOICE;

        CHOICE = commandLineScanner.nextInt();

        switch (CHOICE) {

            case 1:

                CarService car= new CarService();
                Servicevehicle vehicle1 = car.addServicevehicle();
                this.addServiceVehicle(vehicle1);
                break;

            case 2:

                VanService van = new VanService();
                Servicevehicle vehicle2 = van.addServicevehicle();
                this.addServiceVehicle(vehicle2);

                break;

            case 3:

                MotorbikeService motorbikeService = new MotorbikeService();
                Servicevehicle vehicle3 = motorbikeService.addServicevehicle();
                this.addServiceVehicle(vehicle3);
                break;
        }
    }

   @Override
    public void displaycustomer() {

           System.out.println("CUSTOMER INFORMATION!");
           System.out.println(String.format("Customer First Name: %s, Customer Last Name: %s, Customer ID: %s, Customer Mobile Number: %s", this.getFname(), this.getLname(), this.getCusId(), this.getMobilenumber()));
           System.out.println("VEHICLE INFORMATION!");

           for (Servicevehicle c : this.getVehicles()) {
               System.out.println(String.format("Vehicle Type: %s, Vehicle Name: %s, Vehicle Model Number: %s, Vehicle Problem description: %s", c.getType(), c.getVehiclename(), c.getVehiclemodelnumber(), c.getProblemdescription()));
           }

         for (Purchasevehicle r : this.getPvehicles()) {
               System.out.println(String.format("Vehicle Type: %s, Vehicle Name: %s, Vehicle Model Number: %s, Vehicle Price: %s , Vehicle Payment Status: %s", r.getStype(), r.getPname(), r.getPmodelnumber(), r.getPrice(), r.getStype()));
         }

         System.out.println("------------------------------------------\n");
    }

    @Override
    public void deletecustomer() {

        // function is written in Database class.

    }

    @Override
    public void updatecustomer() {



    }
}

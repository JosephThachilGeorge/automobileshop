package model.service;

import database.Database;
import model.customerinformation.Customerinformation;
import model.service.imp.Servicevehicletype;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CarService implements Serviceinfo {

    @Override
    public void calculatecost() {

        int mancost = 25;
        int hours = 2;
        int tax = 2;
        int total = (mancost * hours) * (tax);

        System.out.println("The Cost for Car Service is: " + total + " Euro");

    }

    @Override
    public void display() {
        System.out.println("Car will be delivered with in two days!");

    }

    @Override
    public void expecteddeliverydate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        Date tomorrow = calendar.getTime();
        System.out.println("Expected Delivery Date and Time is:" + tomorrow);

    }

    @Override
    public void discount() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it your first service: Type YES or NO: \n ");
        String b = myObj.next();

        if (b.equalsIgnoreCase("yes")) {

            System.out.println("CONGRATULATION ! YOU HAVE 30 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 60 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");
        }

    }


     @Override

       public Servicevehicle addServicevehicle() {

         Servicevehicle servicevehicle=new Servicevehicle();
         servicevehicle.addVehicle(Servicevehicletype.CAR);
         return servicevehicle;
       }

    @Override
    public void deleteServicevehicle() {

    }

    @Override
    public void updateServicevehicle() {

    }

    @Override
    public String getVehiclename() {
        return null;
    }

    @Override
    public void setVehiclename(String vehiclename) {

    }

    @Override
    public String getVehiclemodelnumber() {
        return null;
    }

    @Override
    public void setVehiclemodelnumber(String vehiclemodelnumber) {

    }

    @Override
    public String getProblemdescription() {
        return null;
    }

    @Override
    public void setProblemdescription(String problemdescription) {

    }

    @Override
    public Servicevehicletype getType() {
        return null;
    }

    @Override
    public void setType(Servicevehicletype type) {

    }
}


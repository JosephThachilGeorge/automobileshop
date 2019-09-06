package model.purchase;

import model.purchase.imp.Purchasevehicletype;

public class Purchasevehicle implements Purchaseinfo {

    private String pname;
    private String pmodelnumber;
    private double price;
    private Purchasevehicletype ptype;
    private Purchasevehicletype stype;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPmodelnumber() {
        return pmodelnumber;
    }

    public void setPmodelnumber(String pmodelnumber) {
        this.pmodelnumber = pmodelnumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Purchasevehicletype getPtype() {
        return ptype;
    }

    public void setPtype(Purchasevehicletype ptype) {
        this.ptype = ptype;
    }

    public Purchasevehicletype getStype() {
        return stype;
    }

    public void setStype(Purchasevehicletype stype) {
        this.stype = stype;
    }

    @Override
    public void addPurchasevehicle() {

    }

    @Override
    public void deletePurchasevehicle() {

    }
    @Override
    public void updatePurchasevehicle() {

    }
}

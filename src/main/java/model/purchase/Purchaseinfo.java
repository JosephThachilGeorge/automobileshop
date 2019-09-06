package model.purchase;

import model.purchase.imp.Purchasevehicletype;

public interface Purchaseinfo {

    void addPurchasevehicle();
    void deletePurchasevehicle();
    void updatePurchasevehicle();

    String getPname();
    void setPname(String pname);

    String getPmodelnumber();
    void setPmodelnumber(String pmodelnumber);

    double getPrice();
    void setPrice(double price);

    Purchasevehicletype getPtype();
    void setPtype(Purchasevehicletype ptype);

    Purchasevehicletype getStype();
    void setStype(Purchasevehicletype stype);

}

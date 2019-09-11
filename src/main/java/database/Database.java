package database;

import model.customerinformation.Customerinformation;
import model.purchase.Purchasevehicle;
import model.service.Servicevehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Database {

    private Map<String, Customerinformation> customerMap = new HashMap<>();

    public void addCustomer(Customerinformation customerinformation) {
        if (customerMap.containsKey(customerinformation.getCusId())) {
            System.out.println("Customer is already present:");
        } else {
            customerMap.put(customerinformation.getCusId(), customerinformation);
           }
    }

    public void updateCustomer(Customerinformation customerinformation) {
        if (customerMap.containsKey(customerinformation.getCusId())) {
            customerMap.put(customerinformation.getCusId(), customerinformation);
        } else {
            System.out.println("Customer is not present");
       }
    }

    public void updatecustomer()
      {
          Scanner commandLineScanner = new Scanner(System.in);
          System.out.println("Enter the Customer ID that you want to Update:");
          String cusId = commandLineScanner.nextLine();
          System.out.println("Enter the new First Name of Customer ");
          String fName = commandLineScanner.nextLine();
          System.out.println("Enter the new Last Name of Customer ");
          String lName = commandLineScanner.nextLine();
          Customerinformation nameInMap = customerMap.get(cusId);
          if (nameInMap != null) {
              nameInMap.setFname(fName);
              nameInMap.setLname(lName);
              updateCustomer(nameInMap);
          }
          System.out.println("Updated Database:");
      }

    public void displaycustomer() {
        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("Which Customer Id?");
        String cusid = commandLineScanner.nextLine();
        displaycustomer(cusid);
    }

    public void displayallcustomer(){

        for (String key : customerMap.keySet()) {
            Customerinformation d = customerMap.get(key);
            d.displaycustomer();
        }

    }

    public void displaycustomer(String cusid) {

       Customerinformation customerData = customerMap.get(cusid);

       if(customerData != null){
           customerData.displaycustomer();
       }else {
           System.out.println("Customer doesn't exist");
       }

    }

    public void deleteCustomer(Customerinformation customerinformation) {
        this.deleteCustomerById(customerinformation.getCusId());
    }

    public void deleteCustomerById(String customerId) {
        if (customerMap.containsKey(customerId)) {
            customerMap.remove(customerId);
        } else {
            System.out.println("Customer is not present");
        }

        return;
    }

    public void deleteCustomer()
    {
        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("Which Customer Id that You Want to Delete?");
        String cusid = commandLineScanner.nextLine();
        System.out.println("Customer is deleted Successfully and Information is Updated!!!!!!!");
        deleteCustomerById(cusid);
    }

    public Map<String, Customerinformation> getCustomerMap() {
        return customerMap;
    }

}

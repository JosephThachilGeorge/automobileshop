package database;

import model.customerinformation.Customerinformation;

import java.util.HashMap;
import java.util.Map;

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

    public Map<String, Customerinformation> getCustomerMap() {
        return customerMap;
    }

}

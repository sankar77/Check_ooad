package mainPackage;
import java.util.ArrayList;
import java.util.List;

import classes.Customer;

public class RentalStore{
    public List<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer customer){
            this.customers.add(customer);
    }

    public List<Customer> returnCustomer(){
            return this.customers;
    }
    


}
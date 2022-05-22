package business.abstracts;

import business.concretes.SmsLogger;
import entities.abstracts.Customer;


public class CustomerManager {

    private ILogger[] iLoggers;


    public CustomerManager(ILogger[] iLoggers) {
        this.iLoggers = iLoggers;
    }


    public void add(Customer customer){
        System.out.println("Adding customer :" + customer.getCustomerId());
          Utilities.runLogger(iLoggers);

        }
        public void addMultiple(Customer[] customers){

            for (Customer customer: customers) {

                System.out.println(customer.getCustomerId() + " Adding customer ");
                Utilities.runLogger(iLoggers);
            }

    }
    //delete bulking  = toplu silme işlemi !
    public void delete(Customer[] customers){
        for (Customer customer: customers) {
            System.out.println(customer.getCustomerId() + "Delete Customer");
            Utilities.runLogger(iLoggers);

        }
    }




    }


package entities.concretes;

import entities.abstracts.Customer;

public class İndividualCustomer extends Customer {

    private String firstName;
    private String lastName;



    public İndividualCustomer(int id, String customerId,String firstName,String lastName) {
        super(id, customerId);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

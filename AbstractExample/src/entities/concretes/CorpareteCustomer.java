package entities.concretes;

import entities.abstracts.Customer;

public class CorpareteCustomer extends Customer {


    private String companyName;
    private String taxNumber;


    public CorpareteCustomer(int id, String customerId,String companyName,String taxNumber) {
        super(id, customerId);
        this.companyName = companyName;
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}

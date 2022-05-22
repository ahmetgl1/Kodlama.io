import business.abstracts.CustomerManager;
import business.abstracts.ILogger;
import business.concretes.DatabaseLogger;
import business.concretes.FileLogger;
import business.concretes.SmsLogger;
import entities.abstracts.Customer;
import entities.concretes.CorpareteCustomer;
import entities.concretes.İndividualCustomer;

public class MainTest {
    public static void main(String[] args) {


        Customer ahmet = new İndividualCustomer(1,"1111111111","Ahmet","Güzeller");
         Customer n11 = new CorpareteCustomer(2,"2222222","n11.com" , "VN : 5001");
        ILogger[] iLoggers = {new SmsLogger() , new DatabaseLogger() ,new FileLogger()};


        Customer[] customers = {ahmet,n11};

        CustomerManager manager = new CustomerManager(iLoggers);
       // manager.add(ahmet);
       // manager.add(n11);
        manager.addMultiple(customers);





    }
}


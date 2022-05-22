package business.concretes;

import business.abstracts.ILogger;

public class SmsLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Sms'e Loglandı !");
    }
}

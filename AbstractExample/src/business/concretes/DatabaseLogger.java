package business.concretes;

import business.abstracts.ILogger;

public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Database'e Loglandı !");
    }
}

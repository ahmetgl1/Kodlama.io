package business.concretes;

import business.abstracts.ILogger;

public class FileLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("File'a Loglandı !");
    }
}

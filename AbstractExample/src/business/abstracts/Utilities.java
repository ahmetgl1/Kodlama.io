package business.abstracts;

import entities.abstracts.Customer;

public class Utilities {

    public static void runLogger(ILogger[] iLoggers) {
        for (ILogger iLogger : iLoggers) {
            iLogger.log();
        }


    }
}

public class SingletonTest {
    public static void main(String[] args) {
        // Retrieve two references from the singleton
        LoggerManager firstLogger = LoggerManager.fetchInstance();
        LoggerManager secondLogger = LoggerManager.fetchInstance();

        System.out.println();

        // Verify if both references refer to the same object
        if (firstLogger == secondLogger) {
            System.out.println("Both LoggerManager references are identical.");
        } else {
            System.out.println("Different instances were returned!");
        }

        // Try writing logs using both references
        firstLogger.writeLog("Initializing first log...");
        secondLogger.writeLog("Processing second log entry.");
    }
}

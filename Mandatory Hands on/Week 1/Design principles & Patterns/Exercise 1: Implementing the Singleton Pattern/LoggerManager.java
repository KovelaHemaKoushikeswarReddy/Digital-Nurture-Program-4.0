public class LoggerManager {
    // Single instance of LoggerManager (eagerly created when needed)
    private static LoggerManager uniqueLogger;

    // Private constructor to restrict external instantiation
    private LoggerManager() {
        // Initialization block for any setup
    }

    // Global access point to the single instance
    public static LoggerManager fetchInstance() {
        if (uniqueLogger == null) {
            synchronized (LoggerManager.class) {
                if (uniqueLogger == null) {
                    uniqueLogger = new LoggerManager();
                }
            }
        }
        return uniqueLogger;
    }

    // Method to output messages
    public void writeLog(String logMsg) {
        System.out.println("LoggerManager says: " + logMsg);
    }
}

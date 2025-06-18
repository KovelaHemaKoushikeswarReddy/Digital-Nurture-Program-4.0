public class SpreadsheetFile implements FileHandler {
    @Override
    public void start() {
        System.out.println("Launching Spreadsheet File...");
    }

    @Override
    public void stop() {
        System.out.println("Terminating Spreadsheet File...");
    }
}

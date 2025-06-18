public class PDFFile implements FileHandler {
    @Override
    public void start() {
        System.out.println("Launching PDF File...");
    }

    @Override
    public void stop() {
        System.out.println("Terminating PDF File...");
    }
}

public class Launcher {
    public static void main(String[] args) {
        // Create a Text File using Factory
        FileCreator txtFactory = new TextFileFactory();
        FileHandler txtFile = txtFactory.generateFile();
        txtFile.start();
        txtFile.stop();

        // Create a PDF File using Factory
        FileCreator pdfMaker = new PDFFileCreator();
        FileHandler pdfFile = pdfMaker.generateFile();
        pdfFile.start();
        pdfFile.stop();

        // Create a Spreadsheet File using Factory
        FileCreator sheetFactory = new SpreadsheetFactory();
        FileHandler sheetFile = sheetFactory.generateFile();
        sheetFile.start();
        sheetFile.stop();
    }
}

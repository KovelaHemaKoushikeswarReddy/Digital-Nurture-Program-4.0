public class PDFFileCreator extends FileCreator {
    @Override
    public FileHandler generateFile() {
        return new PDFFile();
    }
}

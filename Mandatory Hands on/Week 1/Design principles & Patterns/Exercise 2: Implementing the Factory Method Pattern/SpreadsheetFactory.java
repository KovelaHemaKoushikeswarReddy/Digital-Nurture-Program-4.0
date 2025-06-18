public class SpreadsheetFactory extends FileCreator {
    @Override
    public FileHandler generateFile() {
        return new SpreadsheetFile();
    }
}

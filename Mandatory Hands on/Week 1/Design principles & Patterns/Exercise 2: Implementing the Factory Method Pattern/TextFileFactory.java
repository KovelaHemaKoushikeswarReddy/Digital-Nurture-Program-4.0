public class TextFileFactory extends FileCreator {
    @Override
    public FileHandler generateFile() {
        return new TextFile();
    }
}

public class ActualImage implements Visual {
    private String file;

    public ActualImage(String file) {
        this.file = file;
        fetchFromSource();
    }

    private void fetchFromSource() {
        System.out.println("Fetching image from source: " + file);
    }

    @Override
    public void render() {
        System.out.println("Rendering image: " + file);
    }
}

public class LazyImageLoader implements Visual {
    private ActualImage actualImage;
    private String file;

    public LazyImageLoader(String file) {
        this.file = file;
    }

    @Override
    public void render() {
        if (actualImage == null) {
            actualImage = new ActualImage(file);
        }
        actualImage.render();
    }
}

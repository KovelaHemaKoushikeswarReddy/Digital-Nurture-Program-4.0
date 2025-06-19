public class ImageProxyDemo {
    public static void main(String[] args) {
        System.out.println();

        Visual pic1 = new LazyImageLoader("pic1.jpg");
        Visual pic2 = new LazyImageLoader("pic2.jpg");

        // First time: image will be loaded from server
        pic1.render();

        // Cached: no loading required
        pic1.render();

        // First time: image will be loaded
        pic2.render();

        // Cached render
        pic2.render();
    }
}

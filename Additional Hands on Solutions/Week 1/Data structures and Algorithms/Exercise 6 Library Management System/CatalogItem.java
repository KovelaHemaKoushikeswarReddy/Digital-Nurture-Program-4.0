public class CatalogItem {
    private int itemCode;
    private String itemName;
    private String writer;

    public CatalogItem(int itemCode, String itemName, String writer) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.writer = writer;
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
               "Code=" + itemCode +
               ", Title='" + itemName + '\'' +
               ", Author='" + writer + '\'' +
               '}';
    }
}

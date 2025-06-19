public class StockItem {
    private int itemCode;
    private String itemName;
    private int stockCount;
    private double cost;

    public StockItem(int itemCode, String itemName, int stockCount, double cost) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.stockCount = stockCount;
        this.cost = cost;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "StockItem [itemCode=" + itemCode + ", itemName=" + itemName + ", stockCount=" + stockCount + ", cost=" + cost + "]";
    }
}

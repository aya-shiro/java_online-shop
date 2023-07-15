public class Item {
  private int itemID;
  private String itemName;
  private Double price;

  public Item(int itemID, String itemName, Double price) {
    this.itemName = itemName;
    this.itemID = itemID;
    this.price = price;
  }

  public void print() {
    System.out.println("No." + itemID + ":" + itemName + " ￥" + price);
  }
}
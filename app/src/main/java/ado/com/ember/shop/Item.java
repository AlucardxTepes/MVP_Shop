package ado.com.ember.shop;

/**
 * Created by Alucard on 19-Mar-17.
 */

public class Item {
  private String mName;
  private int mPrice;
  private int mId;

  public Item() {
  }

  public Item(int id, String name, int price) {
    mId = id;
    mName = name;
    mPrice = price;
  }

  public int getId() {
    return mId;
  }

  public void setId(int id) {
    mId = id;
  }

  public String getName() {
    return mName;
  }

  public void setName(String name) {
    mName = name;
  }

  public int getPrice() {
    return mPrice;
  }

  public void setPrice(int price) {
    mPrice = price;
  }
}

package ado.com.ember.shop;

/**
 * Created by Alucard on 19-Mar-17.
 */

public interface ItemView {

  int getItemId();
  String getItemName();
  int getItemPrice();

  void displayItemName(String name);
  void displayItemPrice(int price);

  void displayItemNotFoundMessage();
  void displayItemSavedMessage();

  void displayWrongDataMessage();
}

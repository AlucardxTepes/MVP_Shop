package ado.com.ember.shop;

/**
 * Created by Alucard on 19-Mar-17.
 */

interface ItemPresenter extends LifecyclePresenter{

  void setView(ItemView view);
  void loadItemDetails();
  void saveItem();

}

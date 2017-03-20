package ado.com.ember.shop;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alucard on 19-Mar-17.
 */

public class ItemRepositoryImpl implements ItemRepository {

  private List<Item> mItemList;
  private ItemRepositoryImpl mInstance;

  ItemRepositoryImpl() {
    super();
    mItemList = new ArrayList<>();
    mItemList.add(new Item(1, "Potion", 50));
    mItemList.add(new Item(2, "Ether", 1500));
    mItemList.add(new Item(3, "Bastard Sword", 4000));
    mItemList.add(new Item(4, "Void Staff", 3500));
    mItemList.add(new Item(5, "Rapier", 5000));
  }

  @Override
  public Item getItem(int id) {
    return mItemList.get(id); // using ID as position here
  }

  @Override
  public boolean save(Item item) {
    if(mItemList.get(item.getId()) != null){
      // position already taken
      Log.e("TAG", "Repository save error: Position " + item.getId() + "already occupied");
      return false;
    } else {
      mItemList.add(item);
      return true;
    }
  }
}

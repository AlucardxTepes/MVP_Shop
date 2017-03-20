package ado.com.ember.shop;

/**
 * Created by Alucard on 19-Mar-17.
 */

interface ItemRepository {
  Item getItem(int id);
  boolean save(Item item);
}

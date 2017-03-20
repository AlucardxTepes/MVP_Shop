package ado.com.ember.shop;

import android.util.Log;

/**
 * Created by Alucard on 19-Mar-17.
 */

public class ItemPresenterImpl implements ItemPresenter {

  private ItemView mView;
  private ItemRepository mRepository;
  private Item mItem;

  public ItemPresenterImpl(ItemRepository repository) {
    mRepository = repository;
  }

  @Override
  public void setView(ItemView view) {
    mView = view;
  }

  @Override
  public void loadItemDetails() {
    int itemId = mView.getItemId();
    mItem = mRepository.getItem(itemId);

    if(mItem == null) {
      mView.displayItemNotFoundMessage();
    } else {
      mView.displayItemName(mItem.getName());
      mView.displayItemPrice(mItem.getPrice());
    }

  }

  @Override
  public void saveItem() {
    if (!mView.getItemName().trim().equals("") || mView.getItemPrice() != 0) {
      boolean savedOk = mRepository.save(mItem); // backend validation
      if (savedOk) {
        mView.displayItemSavedMessage();
        return;
      }
      mView.displayWrongDataMessage();
    }
  }

  @Override
  public void pause() {
    Log.i("TAG", "Presenter pause: ");
  }

  @Override
  public void resume() {
    Log.i("TAG", "Presenter resume: ");
  }
}

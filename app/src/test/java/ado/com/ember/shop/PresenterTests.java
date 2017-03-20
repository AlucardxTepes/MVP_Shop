package ado.com.ember.shop;

import org.junit.Before;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Alucard on 19-Mar-17.
 */

public class PresenterTests {
  ItemRepository mMockItemRepository;
  ItemView mItemView;
  ItemPresenter mItemPresenter;
  Item mItem;

  @Before
  public void setup() {
    mMockItemRepository = mock(ItemRepository.class);

    mItem = new Item();
    mItem.setId(007);
    mItem.setName("Buster Sword");
    mItem.setPrice(5000);

    when(mMockItemRepository.getItem(anyInt())).thenReturn(mItem);

  }
}
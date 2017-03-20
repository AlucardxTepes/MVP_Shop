package ado.com.ember.shop;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alucard on 19-Mar-17.
 */

@Module
public class AppModule {

  @Singleton
  @Provides
  ItemRepository provideItemRepository(){
    return new ItemRepositoryImpl();
  }

  @Provides
  ItemPresenter provideItemPresenter(ItemRepository itemRepository) {
    return new ItemPresenterImpl(itemRepository);
  }
}

package ado.com.ember.shop;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Alucard on 19-Mar-17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
  void inject(MainActivity target);
}

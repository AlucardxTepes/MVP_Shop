package ado.com.ember.shop;

import android.app.Application;

/**
 * Created by Alucard on 19-Mar-17.
 */

public class ShopApplication extends Application {

  AppComponent mAppComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    mAppComponent = DaggerAppComponent.builder()
            .appModule(new AppModule()).build();

  }

  public AppComponent getAppComponent() {
    return mAppComponent;
  }
}

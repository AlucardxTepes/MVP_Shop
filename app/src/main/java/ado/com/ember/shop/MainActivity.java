package ado.com.ember.shop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ItemView {

  @Inject ItemPresenter mItemPresenter;

  @BindView(R.id.findBtn) Button mFindBtn;
  @BindView(R.id.idEditText) EditText mIdEditText;
  @BindView(R.id.itemNameTextView) TextView mItemNameTextView;
  @BindView(R.id.itemPriceTextView) TextView mItemPriceTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    ((ShopApplication) getApplication()).getAppComponent().inject(this);
    mItemPresenter.setView(this);

    mFindBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        mItemPresenter.loadItemDetails();
      }
    });
  }

  // =========== VIEW METHODS =========== //

  @Override
  public int getItemId() {
    return Integer.valueOf(mIdEditText.getText().toString());
  }

  @Override
  public String getItemName() {
    return mItemNameTextView.getText().toString();
  }

  @Override
  public int getItemPrice() {
    return Integer.valueOf(mItemPriceTextView.getText().toString());
  }

  @Override
  public void displayItemName(String name) {
    mItemNameTextView.setText(name);
  }

  @Override
  public void displayItemPrice(int price) {
    mItemPriceTextView.setText("$" + price);
  }

  @Override
  public void displayItemNotFoundMessage() {
    mItemNameTextView.setText("Error");
    mItemPriceTextView.setText("Item not found");
  }

  @Override
  public void displayItemSavedMessage() {
    // TODO
  }

  @Override
  public void displayWrongDataMessage() {
    // TODO
  }
}

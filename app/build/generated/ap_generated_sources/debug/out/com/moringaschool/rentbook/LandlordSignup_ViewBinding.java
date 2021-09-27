// Generated code from Butter Knife. Do not modify!
package com.moringaschool.rentbook;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LandlordSignup_ViewBinding implements Unbinder {
  private LandlordSignup target;

  @UiThread
  public LandlordSignup_ViewBinding(LandlordSignup target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LandlordSignup_ViewBinding(LandlordSignup target, View source) {
    this.target = target;

    target.landlord_signup_button = Utils.findRequiredViewAsType(source, R.id.landlord_signup_button, "field 'landlord_signup_button'", Button.class);
    target.landlord_name = Utils.findRequiredViewAsType(source, R.id.landlord_name, "field 'landlord_name'", EditText.class);
    target.landlord_email = Utils.findRequiredViewAsType(source, R.id.landlord_email, "field 'landlord_email'", EditText.class);
    target.landlord_phone_number = Utils.findRequiredViewAsType(source, R.id.landlord_phone_number, "field 'landlord_phone_number'", EditText.class);
    target.radio_male = Utils.findRequiredViewAsType(source, R.id.radio_male, "field 'radio_male'", RadioButton.class);
    target.radio_female = Utils.findRequiredViewAsType(source, R.id.radio_female, "field 'radio_female'", RadioButton.class);
    target.landlord_signup_password = Utils.findRequiredViewAsType(source, R.id.landlord_signup_password, "field 'landlord_signup_password'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LandlordSignup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.landlord_signup_button = null;
    target.landlord_name = null;
    target.landlord_email = null;
    target.landlord_phone_number = null;
    target.radio_male = null;
    target.radio_female = null;
    target.landlord_signup_password = null;
  }
}

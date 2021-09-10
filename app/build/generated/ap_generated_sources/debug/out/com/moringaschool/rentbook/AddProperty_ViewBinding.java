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

public class AddProperty_ViewBinding implements Unbinder {
  private AddProperty target;

  @UiThread
  public AddProperty_ViewBinding(AddProperty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddProperty_ViewBinding(AddProperty target, View source) {
    this.target = target;

    target.add_property_submit = Utils.findRequiredViewAsType(source, R.id.add_property_submit, "field 'add_property_submit'", Button.class);
    target.property_name = Utils.findRequiredViewAsType(source, R.id.property_name, "field 'property_name'", EditText.class);
    target.property_location = Utils.findRequiredViewAsType(source, R.id.property_location, "field 'property_location'", EditText.class);
    target.property_number_of_units = Utils.findRequiredViewAsType(source, R.id.property_number_of_units, "field 'property_number_of_units'", EditText.class);
    target.electricity_yes = Utils.findRequiredViewAsType(source, R.id.electricity_yes, "field 'electricity_yes'", RadioButton.class);
    target.electricity_no = Utils.findRequiredViewAsType(source, R.id.electricity_no, "field 'electricity_no'", RadioButton.class);
    target.water_yes = Utils.findRequiredViewAsType(source, R.id.water_yes, "field 'water_yes'", RadioButton.class);
    target.water_no = Utils.findRequiredViewAsType(source, R.id.water_no, "field 'water_no'", RadioButton.class);
    target.internet_yes = Utils.findRequiredViewAsType(source, R.id.internet_yes, "field 'internet_yes'", RadioButton.class);
    target.internet_no = Utils.findRequiredViewAsType(source, R.id.internet_no, "field 'internet_no'", RadioButton.class);
    target.caretaker_name = Utils.findRequiredViewAsType(source, R.id.caretaker_name, "field 'caretaker_name'", EditText.class);
    target.caretaker_phone_number = Utils.findRequiredViewAsType(source, R.id.caretaker_phone_number, "field 'caretaker_phone_number'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddProperty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.add_property_submit = null;
    target.property_name = null;
    target.property_location = null;
    target.property_number_of_units = null;
    target.electricity_yes = null;
    target.electricity_no = null;
    target.water_yes = null;
    target.water_no = null;
    target.internet_yes = null;
    target.internet_no = null;
    target.caretaker_name = null;
    target.caretaker_phone_number = null;
  }
}

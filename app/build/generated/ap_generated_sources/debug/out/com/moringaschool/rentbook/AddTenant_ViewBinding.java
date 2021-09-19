// Generated code from Butter Knife. Do not modify!
package com.moringaschool.rentbook;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddTenant_ViewBinding implements Unbinder {
  private AddTenant target;

  @UiThread
  public AddTenant_ViewBinding(AddTenant target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddTenant_ViewBinding(AddTenant target, View source) {
    this.target = target;

    target.tenant_age = Utils.findRequiredViewAsType(source, R.id.tenant_age, "field 'tenant_age'", EditText.class);
    target.tenancy_date = Utils.findRequiredViewAsType(source, R.id.tenancy_date, "field 'tenancy_date'", EditText.class);
    target.tenant_email = Utils.findRequiredViewAsType(source, R.id.tenant_email, "field 'tenant_email'", EditText.class);
    target.tenant_family_no = Utils.findRequiredViewAsType(source, R.id.tenant_family_no, "field 'tenant_family_no'", RadioButton.class);
    target.tenant_family_yes = Utils.findRequiredViewAsType(source, R.id.tenant_family_yes, "field 'tenant_family_yes'", RadioButton.class);
    target.tenant_male = Utils.findRequiredViewAsType(source, R.id.tenant_male, "field 'tenant_male'", RadioButton.class);
    target.tenant_female = Utils.findRequiredViewAsType(source, R.id.tenant_female, "field 'tenant_female'", RadioButton.class);
    target.tenant_occupation = Utils.findRequiredViewAsType(source, R.id.tenant_occupation, "field 'tenant_occupation'", EditText.class);
    target.tenant_house_number = Utils.findRequiredViewAsType(source, R.id.tenant_house_number, "field 'tenant_house_number'", EditText.class);
    target.tenant_phone_number = Utils.findRequiredViewAsType(source, R.id.tenant_phone_number, "field 'tenant_phone_number'", EditText.class);
    target.tenant_deposit_paid = Utils.findRequiredViewAsType(source, R.id.tenant_deposit_paid, "field 'tenant_deposit_paid'", EditText.class);
    target.tenant_rent_balance = Utils.findRequiredViewAsType(source, R.id.tenant_rent_balance, "field 'tenant_rent_balance'", EditText.class);
    target.tenant_rent_paid = Utils.findRequiredViewAsType(source, R.id.tenant_rent_paid, "field 'tenant_rent_paid'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddTenant target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tenant_age = null;
    target.tenancy_date = null;
    target.tenant_email = null;
    target.tenant_family_no = null;
    target.tenant_family_yes = null;
    target.tenant_male = null;
    target.tenant_female = null;
    target.tenant_occupation = null;
    target.tenant_house_number = null;
    target.tenant_phone_number = null;
    target.tenant_deposit_paid = null;
    target.tenant_rent_balance = null;
    target.tenant_rent_paid = null;
  }
}

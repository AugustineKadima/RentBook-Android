// Generated code from Butter Knife. Do not modify!
package com.moringaschool.rentbook;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PropertyAndTenants_ViewBinding implements Unbinder {
  private PropertyAndTenants target;

  @UiThread
  public PropertyAndTenants_ViewBinding(PropertyAndTenants target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PropertyAndTenants_ViewBinding(PropertyAndTenants target, View source) {
    this.target = target;

    target.add_property = Utils.findRequiredViewAsType(source, R.id.add_property_btn, "field 'add_property'", Button.class);
    target.add_tenant = Utils.findRequiredViewAsType(source, R.id.add_tenant_btn, "field 'add_tenant'", Button.class);
    target.tenants = Utils.findRequiredViewAsType(source, R.id.tenants_btn, "field 'tenants'", Button.class);
    target.property = Utils.findRequiredViewAsType(source, R.id.property_btn, "field 'property'", Button.class);
    target.rv_property = Utils.findRequiredViewAsType(source, R.id.rv_property, "field 'rv_property'", RecyclerView.class);
    target.rv_tenants = Utils.findRequiredViewAsType(source, R.id.rv_tenants, "field 'rv_tenants'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PropertyAndTenants target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.add_property = null;
    target.add_tenant = null;
    target.tenants = null;
    target.property = null;
    target.rv_property = null;
    target.rv_tenants = null;
  }
}

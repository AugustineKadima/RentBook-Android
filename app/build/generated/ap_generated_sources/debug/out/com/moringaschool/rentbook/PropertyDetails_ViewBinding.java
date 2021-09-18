// Generated code from Butter Knife. Do not modify!
package com.moringaschool.rentbook;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PropertyDetails_ViewBinding implements Unbinder {
  private PropertyDetails target;

  @UiThread
  public PropertyDetails_ViewBinding(PropertyDetails target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PropertyDetails_ViewBinding(PropertyDetails target, View source) {
    this.target = target;

    target.view_pager = Utils.findRequiredViewAsType(source, R.id.view_pager, "field 'view_pager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PropertyDetails target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.view_pager = null;
  }
}

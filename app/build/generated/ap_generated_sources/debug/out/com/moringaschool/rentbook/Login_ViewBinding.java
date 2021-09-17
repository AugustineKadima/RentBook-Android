// Generated code from Butter Knife. Do not modify!
package com.moringaschool.rentbook;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Login_ViewBinding implements Unbinder {
  private Login target;

  @UiThread
  public Login_ViewBinding(Login target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Login_ViewBinding(Login target, View source) {
    this.target = target;

    target.login_page_btn = Utils.findRequiredViewAsType(source, R.id.login_page_login_button, "field 'login_page_btn'", Button.class);
    target.login_email = Utils.findRequiredViewAsType(source, R.id.login_email, "field 'login_email'", EditText.class);
    target.login_password = Utils.findRequiredViewAsType(source, R.id.login_password, "field 'login_password'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Login target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.login_page_btn = null;
    target.login_email = null;
    target.login_password = null;
  }
}

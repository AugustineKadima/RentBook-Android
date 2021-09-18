// Generated by view binder compiler. Do not edit!
package com.moringaschool.rentbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moringaschool.rentbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddTenantBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView addTenantFormHeader;

  @NonNull
  public final Button addTenantSubmit;

  @NonNull
  public final ImageView logoImage;

  @NonNull
  public final TextView logoText;

  @NonNull
  public final EditText propertyName;

  @NonNull
  public final EditText tenancyDate;

  @NonNull
  public final EditText tenantAge;

  @NonNull
  public final EditText tenantDepositPaid;

  @NonNull
  public final EditText tenantEmail;

  @NonNull
  public final RadioGroup tenantFamilyGroup;

  @NonNull
  public final TextView tenantFamilyHeader;

  @NonNull
  public final RadioButton tenantFamilyNo;

  @NonNull
  public final RadioButton tenantFamilyYes;

  @NonNull
  public final RadioButton tenantFemale;

  @NonNull
  public final RadioGroup tenantGenderGroup;

  @NonNull
  public final TextView tenantGenderHeader;

  @NonNull
  public final EditText tenantHouseNumber;

  @NonNull
  public final EditText tenantIdNumber;

  @NonNull
  public final RadioButton tenantMale;

  @NonNull
  public final EditText tenantOccupation;

  @NonNull
  public final EditText tenantPhoneNumber;

  @NonNull
  public final EditText tenantPropertyName;

  @NonNull
  public final EditText tenantRentBalance;

  @NonNull
  public final EditText tenantRentPaid;

  private ActivityAddTenantBinding(@NonNull ScrollView rootView,
      @NonNull TextView addTenantFormHeader, @NonNull Button addTenantSubmit,
      @NonNull ImageView logoImage, @NonNull TextView logoText, @NonNull EditText propertyName,
      @NonNull EditText tenancyDate, @NonNull EditText tenantAge,
      @NonNull EditText tenantDepositPaid, @NonNull EditText tenantEmail,
      @NonNull RadioGroup tenantFamilyGroup, @NonNull TextView tenantFamilyHeader,
      @NonNull RadioButton tenantFamilyNo, @NonNull RadioButton tenantFamilyYes,
      @NonNull RadioButton tenantFemale, @NonNull RadioGroup tenantGenderGroup,
      @NonNull TextView tenantGenderHeader, @NonNull EditText tenantHouseNumber,
      @NonNull EditText tenantIdNumber, @NonNull RadioButton tenantMale,
      @NonNull EditText tenantOccupation, @NonNull EditText tenantPhoneNumber,
      @NonNull EditText tenantPropertyName, @NonNull EditText tenantRentBalance,
      @NonNull EditText tenantRentPaid) {
    this.rootView = rootView;
    this.addTenantFormHeader = addTenantFormHeader;
    this.addTenantSubmit = addTenantSubmit;
    this.logoImage = logoImage;
    this.logoText = logoText;
    this.propertyName = propertyName;
    this.tenancyDate = tenancyDate;
    this.tenantAge = tenantAge;
    this.tenantDepositPaid = tenantDepositPaid;
    this.tenantEmail = tenantEmail;
    this.tenantFamilyGroup = tenantFamilyGroup;
    this.tenantFamilyHeader = tenantFamilyHeader;
    this.tenantFamilyNo = tenantFamilyNo;
    this.tenantFamilyYes = tenantFamilyYes;
    this.tenantFemale = tenantFemale;
    this.tenantGenderGroup = tenantGenderGroup;
    this.tenantGenderHeader = tenantGenderHeader;
    this.tenantHouseNumber = tenantHouseNumber;
    this.tenantIdNumber = tenantIdNumber;
    this.tenantMale = tenantMale;
    this.tenantOccupation = tenantOccupation;
    this.tenantPhoneNumber = tenantPhoneNumber;
    this.tenantPropertyName = tenantPropertyName;
    this.tenantRentBalance = tenantRentBalance;
    this.tenantRentPaid = tenantRentPaid;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddTenantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddTenantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_tenant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddTenantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_tenant_form_header;
      TextView addTenantFormHeader = ViewBindings.findChildViewById(rootView, id);
      if (addTenantFormHeader == null) {
        break missingId;
      }

      id = R.id.add_tenant_submit;
      Button addTenantSubmit = ViewBindings.findChildViewById(rootView, id);
      if (addTenantSubmit == null) {
        break missingId;
      }

      id = R.id.logo_image;
      ImageView logoImage = ViewBindings.findChildViewById(rootView, id);
      if (logoImage == null) {
        break missingId;
      }

      id = R.id.logo_text;
      TextView logoText = ViewBindings.findChildViewById(rootView, id);
      if (logoText == null) {
        break missingId;
      }

      id = R.id.property_name;
      EditText propertyName = ViewBindings.findChildViewById(rootView, id);
      if (propertyName == null) {
        break missingId;
      }

      id = R.id.tenancy_date;
      EditText tenancyDate = ViewBindings.findChildViewById(rootView, id);
      if (tenancyDate == null) {
        break missingId;
      }

      id = R.id.tenant_age;
      EditText tenantAge = ViewBindings.findChildViewById(rootView, id);
      if (tenantAge == null) {
        break missingId;
      }

      id = R.id.tenant_deposit_paid;
      EditText tenantDepositPaid = ViewBindings.findChildViewById(rootView, id);
      if (tenantDepositPaid == null) {
        break missingId;
      }

      id = R.id.tenant_email;
      EditText tenantEmail = ViewBindings.findChildViewById(rootView, id);
      if (tenantEmail == null) {
        break missingId;
      }

      id = R.id.tenant_family_group;
      RadioGroup tenantFamilyGroup = ViewBindings.findChildViewById(rootView, id);
      if (tenantFamilyGroup == null) {
        break missingId;
      }

      id = R.id.tenant_family_header;
      TextView tenantFamilyHeader = ViewBindings.findChildViewById(rootView, id);
      if (tenantFamilyHeader == null) {
        break missingId;
      }

      id = R.id.tenant_family_no;
      RadioButton tenantFamilyNo = ViewBindings.findChildViewById(rootView, id);
      if (tenantFamilyNo == null) {
        break missingId;
      }

      id = R.id.tenant_family_yes;
      RadioButton tenantFamilyYes = ViewBindings.findChildViewById(rootView, id);
      if (tenantFamilyYes == null) {
        break missingId;
      }

      id = R.id.tenant_female;
      RadioButton tenantFemale = ViewBindings.findChildViewById(rootView, id);
      if (tenantFemale == null) {
        break missingId;
      }

      id = R.id.tenant_gender_group;
      RadioGroup tenantGenderGroup = ViewBindings.findChildViewById(rootView, id);
      if (tenantGenderGroup == null) {
        break missingId;
      }

      id = R.id.tenant_gender_header;
      TextView tenantGenderHeader = ViewBindings.findChildViewById(rootView, id);
      if (tenantGenderHeader == null) {
        break missingId;
      }

      id = R.id.tenant_house_number;
      EditText tenantHouseNumber = ViewBindings.findChildViewById(rootView, id);
      if (tenantHouseNumber == null) {
        break missingId;
      }

      id = R.id.tenant_id_number;
      EditText tenantIdNumber = ViewBindings.findChildViewById(rootView, id);
      if (tenantIdNumber == null) {
        break missingId;
      }

      id = R.id.tenant_male;
      RadioButton tenantMale = ViewBindings.findChildViewById(rootView, id);
      if (tenantMale == null) {
        break missingId;
      }

      id = R.id.tenant_occupation;
      EditText tenantOccupation = ViewBindings.findChildViewById(rootView, id);
      if (tenantOccupation == null) {
        break missingId;
      }

      id = R.id.tenant_phone_number;
      EditText tenantPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (tenantPhoneNumber == null) {
        break missingId;
      }

      id = R.id.tenant_property_name;
      EditText tenantPropertyName = ViewBindings.findChildViewById(rootView, id);
      if (tenantPropertyName == null) {
        break missingId;
      }

      id = R.id.tenant_rent_balance;
      EditText tenantRentBalance = ViewBindings.findChildViewById(rootView, id);
      if (tenantRentBalance == null) {
        break missingId;
      }

      id = R.id.tenant_rent_paid;
      EditText tenantRentPaid = ViewBindings.findChildViewById(rootView, id);
      if (tenantRentPaid == null) {
        break missingId;
      }

      return new ActivityAddTenantBinding((ScrollView) rootView, addTenantFormHeader,
          addTenantSubmit, logoImage, logoText, propertyName, tenancyDate, tenantAge,
          tenantDepositPaid, tenantEmail, tenantFamilyGroup, tenantFamilyHeader, tenantFamilyNo,
          tenantFamilyYes, tenantFemale, tenantGenderGroup, tenantGenderHeader, tenantHouseNumber,
          tenantIdNumber, tenantMale, tenantOccupation, tenantPhoneNumber, tenantPropertyName,
          tenantRentBalance, tenantRentPaid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

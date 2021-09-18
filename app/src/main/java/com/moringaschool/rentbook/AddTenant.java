package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddTenant extends AppCompatActivity {
    @BindView(R.id.tenant_age) EditText tenant_age;
    @BindView(R.id.tenancy_date) EditText tenancy_date;
    @BindView(R.id.tenant_email) EditText tenant_email;
    @BindView(R.id.tenant_family_no) RadioButton tenant_family_no;
    @BindView(R.id.tenant_family_yes) RadioButton tenant_family_yes;
    @BindView(R.id.tenant_male) RadioButton tenant_male;
    @BindView(R.id.tenant_female) RadioButton tenant_female;
    @BindView(R.id.tenant_occupation) EditText tenant_occupation;
    @BindView(R.id.tenant_house_number) EditText tenant_house_number;
    @BindView(R.id.tenant_phone_number) EditText tenant_phone_number;
    @BindView(R.id.tenant_deposit_paid) EditText tenant_deposit_paid;
    @BindView(R.id.tenant_rent_balance) EditText tenant_rent_balance;
    @BindView(R.id.tenant_rent_paid) EditText tenant_rent_paid;
    String gender;
    String family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tenant);

        ButterKnife.bind(this);

        addTenantToDatabase();
    }

    private void addTenantToDatabase() {
        String tenantAge= tenant_age.getText().toString().trim();
        String tenancyDate = tenancy_date.getText().toString().trim();
        String tenantEmail = tenant_email.getText().toString().trim();
        String tenantOccupation = tenant_occupation.getText().toString().trim();
        String tenantHouseNumber = tenant_house_number.getText().toString().trim();
        String tenantPhoneNumber = tenant_phone_number.getText().toString().trim();
        String tenantPaidDeposit = tenant_deposit_paid.getText().toString().trim();
        String tenantPaidRent = tenant_rent_paid.getText().toString().trim();
        String tenantRentBalance = tenant_rent_balance.getText().toString().trim();

        if(tenant_female.isChecked()){
            gender = "Female";
        }else if(tenant_male.isChecked()){
            gender = "Male";
        }

        if (tenant_family_no.isChecked()){
            family = "No family";
        }else if(tenant_family_yes.isChecked()){
            family = "Has family";
        }

        if(tenantAge.isEmpty()){
            tenant_age.setError("Age required");
            tenant_age.requestFocus();
        }else if(tenancyDate.isEmpty()){
            tenancy_date.setError("Date required");
            tenancy_date.requestFocus();
        }else if (tenantEmail.isEmpty()){
            tenant_email.setError("Email required");
            tenant_email.requestFocus();
        }else if(!Patterns.EMAIL_ADDRESS.matcher(tenantEmail).matches()){
            tenant_email.setError("Use a valid email");
            tenant_email.requestFocus();
        }

    }
}
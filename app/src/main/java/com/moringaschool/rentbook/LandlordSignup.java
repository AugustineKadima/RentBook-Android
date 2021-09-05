package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LandlordSignup extends AppCompatActivity {

    @BindView(R.id.landlord_signup_button) Button landlord_signup_button;
    @BindView(R.id.landlord_name) EditText landlord_name;
    @BindView(R.id.landlord_email) EditText landlord_email;
    @BindView(R.id.landlord_phone_number) EditText landlord_phone_number;
    @BindView(R.id.radio_male) RadioButton radio_male;
    @BindView(R.id.radio_female) RadioButton radio_female;
    @BindView(R.id.number_of_proprerties) EditText number_of_properties;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_signup);
        ButterKnife.bind(this);

        landlord_signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandlordSignup.this, PropertyAndTenants.class);
                startActivity(intent);
            }
        });
    }
}
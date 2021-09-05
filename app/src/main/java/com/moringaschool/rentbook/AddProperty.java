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

public class AddProperty extends AppCompatActivity {

    @BindView(R.id.add_property_submit) Button add_property_submit;
    @BindView(R.id.property_name) EditText property_name;
    @BindView(R.id.property_location) EditText property_location;
    @BindView(R.id.property_number_of_units) EditText property_number_of_units;
    @BindView(R.id.electricity_yes) RadioButton electricity_yes;
    @BindView(R.id.electricity_no) RadioButton electricity_no;
    @BindView(R.id.water_yes) RadioButton water_yes;
    @BindView(R.id.water_no) RadioButton water_no;
    @BindView(R.id.internet_yes) RadioButton internet_yes;
    @BindView(R.id.internet_no) RadioButton internet_no;
    @BindView(R.id.caretaker_name) EditText caretaker_name;
    @BindView(R.id.caretaker_phone_number) EditText caretaker_phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property);

        ButterKnife.bind(this);

        add_property_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddProperty.this, PropertyList.class);
                startActivity(intent);
            }
        });
    }
}
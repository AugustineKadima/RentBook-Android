package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

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
    String water;
    String electricity;
    String internet;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("properties");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property);
        ButterKnife.bind(this);


        add_property_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               saveDataToDatabase();
            }

            private void saveDataToDatabase() {
                String propertyName = property_name.getText().toString().trim();
                String propertyLocation = property_location.getText().toString().trim();
                String propertyNumberOfUnits = property_number_of_units.getText().toString().trim();
                int units = Integer.parseInt(propertyNumberOfUnits);
                String caretakerName = caretaker_name.getText().toString().trim();
                String caretakerPhoneNumber = caretaker_phone_number.getText().toString().trim();

                if(water_yes.isChecked()){
                    water = "Has water";
                }else if(water_no.isChecked()){
                    water = "No water";
                }

                if(electricity_yes.isChecked()){
                    electricity = "Has electricity";
                }else if(electricity_no.isChecked()){
                    electricity = "No electricity";
                }

                if(internet_yes.isChecked()){
                    internet = "Has internet";
                }else if(internet_no.isChecked()){
                    internet = "No internet";
                }

                if(propertyName.isEmpty() && propertyLocation.isEmpty() && propertyNumberOfUnits.isEmpty() && caretakerName.isEmpty() && caretakerPhoneNumber.isEmpty() && ((!internet_yes.isChecked() && !internet_no.isChecked()) && (!water_no.isChecked() && !water_yes.isChecked()) && (!electricity_yes.isChecked() && !electricity_no.isChecked()))){
                    Toast.makeText(AddProperty.this, "Fill all form input fields", Toast.LENGTH_SHORT).show();
                }
                else if(propertyName.isEmpty()){
                    property_name.setError("Property name is required");
                    property_name.requestFocus();
                }else if(propertyLocation.isEmpty()){
                    property_location.setError("Property location is required");
                    property_location.requestFocus();
                }else if(propertyNumberOfUnits.isEmpty()){
                    property_number_of_units.setError("Units required");
                    property_number_of_units.requestFocus();
                }else if(caretakerName.isEmpty()){
                    caretaker_name.setError("Caretaker name required");
                    caretaker_name.requestFocus();
                }else if(caretakerPhoneNumber.isEmpty()){
                    caretaker_phone_number.setError("Phone number required");
                    caretaker_phone_number.requestFocus();
                }else if((!internet_yes.isChecked() && !internet_no.isChecked()) || (!water_no.isChecked() && !water_yes.isChecked()) || (!electricity_yes.isChecked() && !electricity_no.isChecked())){
                    Toast.makeText(AddProperty.this, "Check the appropriate box", Toast.LENGTH_SHORT).show();
                }

                HashMap<String, String> propertyMap = new HashMap<>();
                propertyMap.put("property_name", propertyName);
                propertyMap.put("property_location", propertyLocation);
                propertyMap.put("number_of_units", propertyNumberOfUnits);
                propertyMap.put("caretaker_name", caretakerName);
                propertyMap.put("caretaker_phone_number", caretakerPhoneNumber);
                propertyMap.put("water",water);
                propertyMap.put("electricity", electricity);
                propertyMap.put("internet", internet);

            }
        });
    }
}
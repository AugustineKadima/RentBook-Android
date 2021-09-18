package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LandlordSignup extends AppCompatActivity {

    @BindView(R.id.landlord_signup_button) Button landlord_signup_button;
    @BindView(R.id.landlord_name) EditText landlord_name;
    @BindView(R.id.landlord_email) EditText landlord_email;
    @BindView(R.id.landlord_phone_number) EditText landlord_phone_number;
    @BindView(R.id.radio_male) RadioButton radio_male;
    @BindView(R.id.radio_female) RadioButton radio_female;
    @BindView(R.id.landlord_signup_password) EditText landlord_signup_password;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_signup);
        ButterKnife.bind(this);

        landlord_signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mAuth = FirebaseAuth.getInstance();


                String landlordName = landlord_name.getText().toString().trim();
                String landlordEmail = landlord_email.getText().toString().trim();
                String landlordPhoneNumber = landlord_phone_number.getText().toString().trim();
                String landlordPassword = landlord_signup_password.getText().toString().trim();

                if(landlordName.isEmpty() && landlordEmail.isEmpty() && landlordPhoneNumber.isEmpty() && landlordPassword.isEmpty()){
                    Toast.makeText(LandlordSignup.this, "Name, email and phone number are required to signup", Toast.LENGTH_LONG).show();

                }else if(landlordName.isEmpty()){
                    landlord_name.setError("Name is required");
                    landlord_name.requestFocus();
                    return;
                }else if(landlordEmail.isEmpty()){
                    landlord_email.setError("Email is required");
                    landlord_email.requestFocus();
                    return;
                }else if(landlordPhoneNumber.isEmpty()){
                    landlord_phone_number.setError("Phone number required");
                    landlord_phone_number.requestFocus();
                    return;
                }else if (landlordPassword.isEmpty()){
                    landlord_signup_password.setError("Password is required");
                    landlord_signup_password.requestFocus();
                    return;
                }
                Intent intent = new Intent(LandlordSignup.this, PropertyAndTenants.class);
                startActivity(intent);

            }
        });
    }
}
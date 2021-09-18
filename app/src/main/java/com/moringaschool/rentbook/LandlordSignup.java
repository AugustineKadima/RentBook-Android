package com.moringaschool.rentbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.moringaschool.rentbook.modules.Landlord;

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
    String gender;
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

                if (radio_male.isChecked()){
                    gender = "Male";
                }else if(radio_female.isChecked()){
                    gender = "Female";
                }

                if(landlordName.isEmpty() && landlordEmail.isEmpty() && landlordPhoneNumber.isEmpty() && landlordPassword.isEmpty()){
                    Toast.makeText(LandlordSignup.this, "Name, email and phone number are required to signup", Toast.LENGTH_LONG).show();

                }else if(landlordName.isEmpty()){
                    landlord_name.setError("Name is required");
                    landlord_name.requestFocus();
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
                }else if(!Patterns.EMAIL_ADDRESS.matcher(landlordEmail).matches()){
                    landlord_email.setError("Please provide a valid email");
                    landlord_email.requestFocus();
                    return;
                }else if(landlordPassword.length() < 6){
                    landlord_signup_password.setError("Password should contain at least 6 values");
                    landlord_signup_password.requestFocus();
                    return;
                }else{

                    mAuth.createUserWithEmailAndPassword(landlordEmail, landlordPassword)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        Landlord landlord = new Landlord(landlordName, landlordEmail, landlordPassword, landlordPhoneNumber, gender);
                                        FirebaseDatabase.getInstance().getReference("landlords")
                                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                                .setValue(landlord).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if(task.isSuccessful()){
                                                    Toast.makeText(LandlordSignup.this, "You signed up successfully", Toast.LENGTH_SHORT).show();

                                                    Intent intent = new Intent(LandlordSignup.this, Login.class);
                                                    startActivity(intent);
                                                    finish();
                                                }else{
                                                    Toast.makeText(LandlordSignup.this, "Failed! Try again.", Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                    }else{
                                        Toast.makeText(LandlordSignup.this, "Failed! Try again.", Toast.LENGTH_LONG).show();
                                    }
                                }
                            });


                }


            }
        });
    }
}
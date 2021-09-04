package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LandlordSignup extends AppCompatActivity {
    @BindView(R.id.landlord_signup_button) Button landlord_signup_button;

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
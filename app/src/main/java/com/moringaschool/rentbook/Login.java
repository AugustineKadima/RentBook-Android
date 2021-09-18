package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity {
    @BindView(R.id.login_page_login_button) Button login_page_btn;
    @BindView((R.id.login_email)) EditText login_email;
    @BindView(R.id.login_password) EditText login_password;
    FirebaseAuth mAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);


        login_page_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = login_email.getText().toString().trim();
                String Password = login_password.getText().toString().trim();

                if (Email.isEmpty() && Password.isEmpty()) {
                    Toast.makeText(Login.this, "Email and Password required", Toast.LENGTH_LONG).show();
                }else if(Email.isEmpty()){
                    login_email.setError("Email required");
                    login_email.requestFocus();
                }else if(Password.isEmpty()){
                    login_password.setError("Password required");
                    login_password.requestFocus();
                }
                else{
                    Intent intent = new Intent(Login.this, PropertyAndTenants.class);
                    startActivity(intent);
                }
            }
        });
    }
}
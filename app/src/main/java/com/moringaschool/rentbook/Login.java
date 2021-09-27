package com.moringaschool.rentbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.moringaschool.rentbook.constants.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity {
    @BindView(R.id.login_page_login_button) Button login_page_btn;
    @BindView((R.id.login_email)) EditText login_email;
    @BindView(R.id.login_password) EditText login_password;
    @BindView(R.id.check_box) CheckBox checkBox;
    FirebaseAuth mAuth;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        mAuth = FirebaseAuth.getInstance();

//        Shared preferences
        sharedPreferences = getSharedPreferences("login_ref", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        login_email.setText(sharedPreferences.getString("login_email", null));
        login_password.setText(sharedPreferences.getString("login_password", null));

        login_page_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = login_email.getText().toString().trim();
                String Password = login_password.getText().toString().trim();
                boolean rememberMe = checkBox.isChecked();
                String USER_EMAIL = Constants.getUserEmail();
                String PASSWORD = Constants.getPASSWORD();

                if(rememberMe){
                    editor.putString(USER_EMAIL, Email).apply();
                    editor.putString(PASSWORD, Password).apply();
//                    editor.commit();
//
                }

                if (Email.isEmpty() && Password.isEmpty()) {
                    Toast.makeText(Login.this, "Email and Password required", Toast.LENGTH_LONG).show();
                }else if(Email.isEmpty()){
                    login_email.setError("Email required");
                    login_email.requestFocus();
                }else if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
                    login_email.setError("Please provide a valid email");
                    login_email.requestFocus();
                }

                else if(Password.isEmpty()){
                    login_password.setError("Password required");
                    login_password.requestFocus();
                }else if(Password.length() < 6){
                    login_password.setError("Password should contain a minimum of 6 values");
                }
                else{

                    mAuth.signInWithEmailAndPassword(Email,Password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){

                                    Intent intent = new Intent(Login.this, PropertyAndTenants.class);
                                    startActivity(intent);
                                }
                                else{
                                    Toast.makeText(Login.this, "Failed to login! Please check your credentials.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                }
            }
        });
    }
}
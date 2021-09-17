package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.moringaschool.rentbook.fragments.PropertyDetailFragment;

public class PropertyDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_details);

        replaceFragment();
    }

    public void replaceFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PropertyDetailFragment propertyDetailFragment = new PropertyDetailFragment();
        fragmentTransaction.replace(R.id.fragment_container, propertyDetailFragment);
        fragmentTransaction.commit();
    }
}
package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PropertyAndTenants extends AppCompatActivity {

    @BindView(R.id.add_property_btn) Button add_property;
    @BindView(R.id.add_tenant_btn) Button add_tenant;
    @BindView(R.id.tenants_btn) Button tenants;
    @BindView(R.id.property_btn) Button property;

    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_and_tenants);
        ButterKnife.bind(this);

        animation = AnimationUtils.loadAnimation(this, R.anim.list_slide_animation);
        add_property.setAnimation(animation);
        add_tenant.setAnimation(animation);
        tenants.setAnimation(animation);
        property.setAnimation(animation);

        add_property.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PropertyAndTenants.this, AddProperty.class);
                startActivity(intent);
            }
        });

        add_tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PropertyAndTenants.this, AddTenant.class);
                startActivity(intent);
            }
        });

        property.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PropertyAndTenants.this, PropertyList.class);
                startActivity(intent);
            }
        });

        tenants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PropertyAndTenants.this, TenantsList.class);
                startActivity(intent);
            }
        });
    }

}
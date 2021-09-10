package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.moringaschool.rentbook.modules.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PropertyAndTenants extends AppCompatActivity {

    @BindView(R.id.add_property_btn) Button add_property;
    @BindView(R.id.add_tenant_btn) Button add_tenant;
    @BindView(R.id.tenants_btn) Button tenants;
    @BindView(R.id.property_btn) Button property;
    @BindView(R.id.rv_property) RecyclerView rv_property;
    @BindView(R.id.rv_tenants) RecyclerView rv_tenants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_and_tenants);
        ButterKnife.bind(this);

        add_property.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayoutManager layoutManager= new LinearLayoutManager(PropertyAndTenants.this, LinearLayoutManager.VERTICAL, false);
                TenantsAdapter adapter = new TenantsAdapter(PropertyAndTenants.this, Utils.getAllTenants());
                rv_tenants.setLayoutManager(layoutManager);
                rv_tenants.setAdapter(adapter);
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
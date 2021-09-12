package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moringaschool.rentbook.adapters.TenantAdapter;
import com.moringaschool.rentbook.item_models.TenantItemModel;

import java.util.ArrayList;
import java.util.List;

public class TenantsList extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<TenantItemModel> tenantItems;
    TenantAdapter tenantAdapter;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenants_list);

        initData();
        initRecyclerView();
    }

    private void initData() {
        tenantItems = new ArrayList<>();
        tenantItems.add(new TenantItemModel("C3", "Mokia", "1/4/1980"));
        tenantItems.add(new TenantItemModel("C1", "John", "1/4/1980"));
        tenantItems.add(new TenantItemModel("A3", "Doe", "1/4/1980"));
        tenantItems.add(new TenantItemModel("V3", "Kevin", "1/4/1980"));
        tenantItems.add(new TenantItemModel("C4", "Phanice", "1/4/1980"));
        tenantItems.add(new TenantItemModel("H3", "Dan", "1/4/1980"));
        tenantItems.add(new TenantItemModel("C6", "Tonny", "1/4/1980"));
        tenantItems.add(new TenantItemModel("C5", "Johny", "1/4/1980"));
        tenantItems.add(new TenantItemModel("C9", "Kelvin", "1/4/1980"));
        tenantItems.add(new TenantItemModel("C12", "Anita", "1/4/1980"));
        tenantItems.add(new TenantItemModel("C33", "Triza", "1/4/1980"));

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.rv_tenants);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        tenantAdapter = new TenantAdapter(tenantItems);
        recyclerView.setAdapter(tenantAdapter);
        tenantAdapter.notifyDataSetChanged();
    }
}
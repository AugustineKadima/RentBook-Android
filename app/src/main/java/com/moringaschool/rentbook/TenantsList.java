package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moringaschool.rentbook.adapters.TenantAdapter;
import com.moringaschool.rentbook.api.ApiClient;
import com.moringaschool.rentbook.api.ApiInterface;
import com.moringaschool.rentbook.modules.Tenant;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TenantsList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Tenant> tenantItems;
    private TenantAdapter adapter;
    private ApiInterface apiInterface;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenants_list);

        recyclerView = (RecyclerView) findViewById(R.id.rv_tenants);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Tenant>> call = apiInterface.getTenants();

        call.enqueue(new Callback<List<Tenant>>() {
            @Override
            public void onResponse(Call<List<Tenant>> call, Response<List<Tenant>> response) {
                tenantItems = response.body();
                adapter = new TenantAdapter(tenantItems);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Tenant>> call, Throwable t) {

            }
        });
    }

}
package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moringaschool.rentbook.adapters.PropertyAdapter;
import com.moringaschool.rentbook.api.ApiClient;
import com.moringaschool.rentbook.api.ApiInterface;
import com.moringaschool.rentbook.modules.Property;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PropertyList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Property> propertyItems;
    private PropertyAdapter adapter;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_list);

        recyclerView = (RecyclerView) findViewById(R.id.rv_property);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Property>> call = apiInterface.getProperties();

        call.enqueue(new Callback<List<Property>>() {
            @Override
            public void onResponse(Call<List<Property>> call, Response<List<Property>> response) {
                propertyItems = response.body();
                adapter = new PropertyAdapter(PropertyList.this, propertyItems);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Property>> call, Throwable t) {

            }
        });
    }

}
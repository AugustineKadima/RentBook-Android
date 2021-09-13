package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.moringaschool.rentbook.adapters.PropertyAdapter;
import com.moringaschool.rentbook.api.JsonPlaceholderApi;
import com.moringaschool.rentbook.item_models.PropertyItemModel;
import com.moringaschool.rentbook.modules.Property;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PropertyList extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<Property> propertyItems;
    PropertyAdapter propertyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_list);

        initData();
        initRecyclerView();
    }

    private void initData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rentbookapi.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceholderApi jsonPlaceholderApi = retrofit.create(JsonPlaceholderApi.class);

        Call<List<Property>> call = jsonPlaceholderApi.getProperties();

        call.enqueue(new Callback<List<Property>>() {
            @Override
            public void onResponse(Call<List<Property>> call, Response<List<Property>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(PropertyList.this, "Error code: " + response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                List<Property> propertyItems = response.body();
            }

            @Override
            public void onFailure(Call<List<Property>> call, Throwable t) {
                Toast.makeText(PropertyList.this, "There was an error while accessing the database: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.rv_property);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        propertyAdapter = new PropertyAdapter(propertyItems);
        recyclerView.setAdapter(propertyAdapter);
        propertyAdapter.notifyDataSetChanged();
    }
}
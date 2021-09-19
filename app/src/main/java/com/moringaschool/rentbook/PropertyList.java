package com.moringaschool.rentbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.moringaschool.rentbook.adapters.PropertyAdapter;
import com.moringaschool.rentbook.api.ApiClient;
import com.moringaschool.rentbook.api.ApiInterface;
import com.moringaschool.rentbook.modules.Property;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PropertyList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Property> propertyItems;
    private PropertyAdapter adapter;
//    private ApiInterface apiInterface;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("properties");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_list);

        recyclerView = (RecyclerView) findViewById(R.id.rv_property);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        propertyItems = new ArrayList<>();
        adapter = new PropertyAdapter(this, propertyItems);

        recyclerView.setAdapter(adapter);

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot: snapshot.getChildren()){
                    Property property = dataSnapshot.getValue(Property.class);
                    propertyItems.add(property);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

//        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
//
//        Call<List<Property>> call = apiInterface.getProperties();
//
//        call.enqueue(new Callback<List<Property>>() {
//            @Override
//            public void onResponse(Call<List<Property>> call, Response<List<Property>> response) {
//                propertyItems = response.body();
//                adapter = new PropertyAdapter(PropertyList.this, propertyItems);
//                recyclerView.setAdapter(adapter);
//            }
//
//            @Override
//            public void onFailure(Call<List<Property>> call, Throwable t) {
//
//            }
//        });
    }

}
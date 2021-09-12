package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moringaschool.rentbook.adapters.PropertyAdapter;
import com.moringaschool.rentbook.item_models.PropertyItemModel;

import java.util.ArrayList;
import java.util.List;

public class PropertyList extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<PropertyItemModel> propertyItems;
    PropertyAdapter propertyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_list);

        initData();
        initRecyclerView();
    }

    private void initData() {
        propertyItems = new ArrayList<>();
        propertyItems.add(new PropertyItemModel("KimTech Flats", "Kajiado"));
        propertyItems.add(new PropertyItemModel("Zion Flats", "Kisumu"));
        propertyItems.add(new PropertyItemModel("Roma Flats", "Nairobi"));
        propertyItems.add(new PropertyItemModel("Kenya Flats", "Kajiado"));
        propertyItems.add(new PropertyItemModel("High Flats", "Kidiwaa"));
        propertyItems.add(new PropertyItemModel("KimTech Flats", "Kajiado"));
        propertyItems.add(new PropertyItemModel("Zion Flats", "Kisumu"));
        propertyItems.add(new PropertyItemModel("Roma Flats", "Nairobi"));
        propertyItems.add(new PropertyItemModel("Kenya Flats", "Kajiado"));
        propertyItems.add(new PropertyItemModel("High Flats", "Kidiwaa"));
        propertyItems.add(new PropertyItemModel("KimTech Flats", "Kajiado"));
        propertyItems.add(new PropertyItemModel("Zion Flats", "Kisumu"));
        propertyItems.add(new PropertyItemModel("Roma Flats", "Nairobi"));
        propertyItems.add(new PropertyItemModel("Kenya Flats", "Kajiado"));
        propertyItems.add(new PropertyItemModel("High Flats", "Kidiwaa"));

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
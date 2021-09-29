package com.moringaschool.rentbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.SearchView;
import android.widget.Toast;

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

    private List<String> userIds;

//   Animation

    Animation falldown;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("properties");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_list);

        recyclerView = (RecyclerView) findViewById(R.id.rv_property);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

//   Animation

        falldown = AnimationUtils.loadAnimation(this, R.anim.fall_down);

        propertyItems = new ArrayList<>();
        userIds = new ArrayList<>();

        adapter = new PropertyAdapter(this, propertyItems);

        recyclerView.setAnimation(falldown);
        recyclerView.setAdapter(adapter);


        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);


        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                userIds.clear();
                propertyItems.clear();
                for(DataSnapshot dataSnapshot: snapshot.getChildren()){
                    Property property = dataSnapshot.getValue(Property.class);
                    propertyItems.add(property);
                    userIds.add(dataSnapshot.getKey());
                }
                adapter.setIds(userIds);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        Initialize menu inflater
        MenuInflater menuInflater = getMenuInflater();

//        Inflate menu
        menuInflater.inflate(R.menu.menu, menu);

//        Initialize menu item
        MenuItem menuItem = menu.findItem(R.id.action_search);

//        Initialize search view
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }


//Gestures
    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
            if(direction == ItemTouchHelper.LEFT){
                adapter.deleteItem(viewHolder.getAdapterPosition());
                Toast.makeText(PropertyList.this, "Deleting", Toast.LENGTH_SHORT).show();
            }
        }
    };



}
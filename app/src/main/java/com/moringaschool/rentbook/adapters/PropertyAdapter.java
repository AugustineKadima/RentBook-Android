package com.moringaschool.rentbook.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.moringaschool.rentbook.PropertyDetails;
import com.moringaschool.rentbook.PropertyList;
import com.moringaschool.rentbook.R;
import com.moringaschool.rentbook.modules.Property;
import com.moringaschool.rentbook.utils.ItemTouchHelperAdapter;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.ViewHolder> implements Filterable, ItemTouchHelperAdapter{

    private List<Property> propertyList;
    private List<Property> propertyListAll;
    Context mContext;

    public PropertyAdapter(Context mContext ,List<Property> propertyList) {
        this.propertyList = propertyList;
        this.mContext = mContext;
        this.propertyListAll = new ArrayList<>(propertyList);
    }

    @NonNull
    @Override
    public PropertyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.property_list_item, parent, false);
        return new ViewHolder(view);
    }


//    Delete Item
    public void deleteItem(){
        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference("properties");
        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {
                notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyAdapter.ViewHolder holder, int position) {
        Property property = propertyList.get(position);
        holder.property_display_name.setText(property.getProperty_name());
        holder.property_display_location.setText(property.getProperty_location());
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

//    Filter for menu search
    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
//        Run on background thread
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            List<Property> filterList = new ArrayList<>();
            if(charSequence.toString().isEmpty()){
                filterList.addAll(propertyListAll);
            }else{
                for(Property property: propertyListAll){
                    if(property.getProperty_name().toLowerCase().contains(charSequence.toString().toLowerCase())){
                        filterList.add(property);
                    }
                }
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = filterList;

            return filterResults;
        }

//        Run on ui thread
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            propertyList.clear();
            propertyList.addAll((Collection<? extends Property>) filterResults.values);
            notifyDataSetChanged();
        }
    };

//    ItemTouchHelper
    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        Collections.swap(propertyList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
//        setIndexInForebase();
        return false;
    }

    @Override
    public void onItemDismiss(int position) {

    }




    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView property_display_name, property_display_location;
        private Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            View rootView =itemView;
            context = itemView.getContext();

            property_display_name = (TextView) itemView.findViewById(R.id.property_display_name);
            property_display_location = (TextView) itemView.findViewById(R.id.property_display_location);

            rootView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int itemPosition = getLayoutPosition();
                    Intent intent = new Intent(context, PropertyDetails.class);

                    intent.putExtra("position", itemPosition);
                    intent.putExtra("property_detail",Parcels.wrap(propertyList));

                    mContext.startActivity(intent);
                }
            });

        }



    }
}

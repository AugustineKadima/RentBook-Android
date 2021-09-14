package com.moringaschool.rentbook.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.rentbook.R;
import com.moringaschool.rentbook.modules.Property;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.ViewHolder> {

    List<Property> propertyList;

    public PropertyAdapter(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @NonNull
    @Override
    public PropertyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.property_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyAdapter.ViewHolder holder, int position) {
        holder.property_display_name.setText(propertyList.get(position).getName());
        holder.property_display_location.setText(propertyList.get(position).getLocation());
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView property_display_name, property_display_location;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            property_display_name = (TextView) itemView.findViewById(R.id.property_display_name);
            property_display_location = (TextView) itemView.findViewById(R.id.property_display_location);
        }

    }
}

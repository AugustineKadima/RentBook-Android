package com.moringaschool.rentbook.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.rentbook.PropertyDetails;
import com.moringaschool.rentbook.PropertyList;
import com.moringaschool.rentbook.R;
import com.moringaschool.rentbook.modules.Property;

import org.parceler.Parcels;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.ViewHolder> {

    private List<Property> propertyList;
    Context mContext;

    public PropertyAdapter(Context mContext ,List<Property> propertyList) {
        this.propertyList = propertyList;
        this.mContext = mContext;
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

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView property_display_name, property_display_location;
        View rootView;
        Context context;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            context = itemView.getContext();
//            rootView = itemView;

            property_display_name = (TextView) itemView.findViewById(R.id.property_display_name);
            property_display_location = (TextView) itemView.findViewById(R.id.property_display_location);

//            itemView.setOnClickListener((v) -> {
//                Intent intent = new Intent(rootView.getContext(), PropertyDetails.class);
//                rootView.getContext().startActivity(intent);
//
//            });
        }

        @Override
        public void onClick(View view) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(context, PropertyDetails.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("property_key", Parcels.wrap(propertyList));
            mContext.startActivity(intent);
        }
    }
}

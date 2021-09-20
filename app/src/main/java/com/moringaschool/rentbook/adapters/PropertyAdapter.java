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
        View view = LayoutInflater.from(mContext).inflate(R.layout.property_list_item, parent, false);
        return new ViewHolder(view);
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


//        @Override
//        public void onClick(View view) {
//            int itemPosition = getLayoutPosition();
//            Intent intent = new Intent(context, PropertyDetails.class);
//            intent.putExtra("position", itemPosition);
//            intent.putExtra("property_detail",Parcels.wrap(propertyList));
//            mContext.startActivity(intent);
//        }
    }
}

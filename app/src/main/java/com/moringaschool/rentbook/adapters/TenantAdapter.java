package com.moringaschool.rentbook.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.rentbook.R;
import com.moringaschool.rentbook.item_models.TenantItemModel;

import java.util.List;

public class TenantAdapter extends RecyclerView.Adapter<TenantAdapter.ViewHolder>{

    List<TenantItemModel> tenantList;

    public TenantAdapter(List<TenantItemModel> tenantList) {
        this.tenantList = tenantList;
    }

    @NonNull
    @Override
    public TenantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tenant_list_item, parent, false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TenantAdapter.ViewHolder holder, int position) {
        String tenantName = tenantList.get(position).getTenant_display_name();
        String tenantSince = tenantList.get(position).getTenancy_date_display();
        String tenantHouseNumber = tenantList.get(position).getTenant_display_room();

        holder.setData(tenantName, tenantHouseNumber, tenantSince);
    }

    @Override
    public int getItemCount() {
        return tenantList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tenant_display_room, tenant_display_name, tenancy_date_display;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tenant_display_room = itemView.findViewById(R.id.tenant_display_room);
            tenant_display_name = itemView.findViewById(R.id.tenant_display_name);
            tenancy_date_display = itemView.findViewById(R.id.tenancy_date_display);
        }

        public void setData(String tenantName, String tenantHouseNumber, String tenantSince) {
            tenant_display_room.setText(tenantHouseNumber);
            tenant_display_name.setText(tenantName);
            tenancy_date_display.setText(tenantSince);
        }
    }
}

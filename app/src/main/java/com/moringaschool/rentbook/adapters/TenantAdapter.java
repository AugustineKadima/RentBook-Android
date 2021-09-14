package com.moringaschool.rentbook.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.rentbook.R;
import com.moringaschool.rentbook.item_models.TenantItemModel;
import com.moringaschool.rentbook.modules.Tenant;

import java.util.List;

public class TenantAdapter extends RecyclerView.Adapter<TenantAdapter.ViewHolder>{

    List<Tenant> tenantList;

    public TenantAdapter(List<Tenant> tenantList) {
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
       holder.tenant_display_name.setText(tenantList.get(position).getName());
       holder.tenant_display_room.setText(tenantList.get(position).getHouse_number());
       holder.tenant_display_email.setText(tenantList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return tenantList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tenant_display_room, tenant_display_name, tenant_display_email;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tenant_display_room = (TextView) itemView.findViewById(R.id.tenant_display_room);
            tenant_display_name = (TextView) itemView.findViewById(R.id.tenant_display_name);
            tenant_display_email = (TextView) itemView.findViewById(R.id.tenant_display_email);
        }

    }
}

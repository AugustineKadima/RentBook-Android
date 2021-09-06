package com.moringaschool.rentbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.rentbook.modules.Tenant;

import java.util.ArrayList;

public class TenantsAdapter extends RecyclerView.Adapter<TenantsAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Tenant> tenants;

    public TenantsAdapter(Context context, ArrayList<Tenant> tenants){
        this.context = context;
        this.tenants = tenants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_tenants_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tenant tenant = tenants.get(position);
        holder.tenant_display_name.setText(tenant.getName());
        holder.tenancy_date.setText(tenant.getTenancyDate());
    }

    @Override
    public int getItemCount() {
        return tenants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView tenant_display_name;
       TextView tenancy_date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tenant_display_name = itemView.findViewById(R.id.tenant_display_name);
            tenancy_date = itemView.findViewById(R.id.tenancy_date_display);
        }
    }
}

package com.moringaschool.rentbook.item_models;

import android.widget.TextView;

public class TenantItemModel {
    String tenant_display_room, tenant_display_name, tenancy_date_display;

    public TenantItemModel(String tenant_display_room, String  tenant_display_name, String  tenancy_date_display) {
        this.tenant_display_room = tenant_display_room;
        this.tenant_display_name = tenant_display_name;
        this.tenancy_date_display = tenancy_date_display;
    }

    public String  getTenant_display_room() {
        return tenant_display_room;
    }

    public void setTenant_display_room(String  tenant_display_room) {
        this.tenant_display_room = tenant_display_room;
    }

    public String getTenant_display_name() {
        return tenant_display_name;
    }

    public void setTenant_display_name(String  tenant_display_name) {
        this.tenant_display_name = tenant_display_name;
    }

    public String  getTenancy_date_display() {
        return tenancy_date_display;
    }

    public void setTenancy_date_display(String tenancy_date_display) {
        this.tenancy_date_display = tenancy_date_display;
    }
}

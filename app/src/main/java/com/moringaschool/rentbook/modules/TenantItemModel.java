package com.moringaschool.rentbook.modules;

import android.widget.TextView;

public class TenantItemModel {
    TextView tenant_display_room, tenant_display_name, tenancy_date_display;

    public TenantItemModel(TextView tenant_display_room, TextView tenant_display_name, TextView tenancy_date_display) {
        this.tenant_display_room = tenant_display_room;
        this.tenant_display_name = tenant_display_name;
        this.tenancy_date_display = tenancy_date_display;
    }

    public TextView getTenant_display_room() {
        return tenant_display_room;
    }

    public void setTenant_display_room(TextView tenant_display_room) {
        this.tenant_display_room = tenant_display_room;
    }

    public TextView getTenant_display_name() {
        return tenant_display_name;
    }

    public void setTenant_display_name(TextView tenant_display_name) {
        this.tenant_display_name = tenant_display_name;
    }

    public TextView getTenancy_date_display() {
        return tenancy_date_display;
    }

    public void setTenancy_date_display(TextView tenancy_date_display) {
        this.tenancy_date_display = tenancy_date_display;
    }
}

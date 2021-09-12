package com.moringaschool.rentbook.item_models;

import android.widget.TextView;

public class PropertyItemModel {

    TextView property_display_name,property_display_location;

    public PropertyItemModel(TextView property_display_name, TextView property_display_location) {
        this.property_display_name = property_display_name;
        this.property_display_location = property_display_location;
    }

    public TextView getProperty_display_name() {
        return property_display_name;
    }

    public void setProperty_display_name(TextView property_display_name) {
        this.property_display_name = property_display_name;
    }

    public TextView getProperty_display_location() {
        return property_display_location;
    }

    public void setProperty_display_location(TextView property_display_location) {
        this.property_display_location = property_display_location;
    }
}

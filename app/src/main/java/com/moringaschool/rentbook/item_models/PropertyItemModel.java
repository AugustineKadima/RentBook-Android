package com.moringaschool.rentbook.item_models;

public class PropertyItemModel {

    String property_display_name,property_display_location;

    public PropertyItemModel(String property_display_name, String property_display_location) {
        this.property_display_name = property_display_name;
        this.property_display_location = property_display_location;
    }

    public String getProperty_display_name() {
        return property_display_name;
    }

    public void setProperty_display_name(String property_display_name) {
        this.property_display_name = property_display_name;
    }

    public String getProperty_display_location() {
        return property_display_location;
    }

    public void setProperty_display_location(String property_display_location) {
        this.property_display_location = property_display_location;
    }
}

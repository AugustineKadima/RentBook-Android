package com.moringaschool.rentbook.modules;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

@Parcel
public class Property {
    private String caretaker_name;
    private String caretaker_phone_number;
    private String electricity;
    private String internet;
    private String number_of_units;
    private String property_location;
    private String property_name;
    private String water;

    public Property(){}

    public Property(String caretaker_name, String caretaker_phone_number, String electricity, String internet, String number_of_units, String property_location, String property_name, String water) {
        this.caretaker_name = caretaker_name;
        this.caretaker_phone_number = caretaker_phone_number;
        this.electricity = electricity;
        this.internet = internet;
        this.number_of_units = number_of_units;
        this.property_location = property_location;
        this.property_name = property_name;
        this.water = water;
    }

    public String getCaretaker_name() {
        return caretaker_name;
    }

    public String getCaretaker_phone_number() {
        return caretaker_phone_number;
    }

    public String getElectricity() {
        return electricity;
    }

    public String getInternet() {
        return internet;
    }

    public String getNumber_of_units() {
        return number_of_units;
    }

    public String getProperty_location() {
        return property_location;
    }

    public String getProperty_name() {
        return property_name;
    }

    public String getWater() {
        return water;
    }
}

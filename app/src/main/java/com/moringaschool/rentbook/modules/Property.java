package com.moringaschool.rentbook.modules;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

@Parcel
public class Property {
    private int id;
    private String name;
    private String location;
    private int number_of_units;
    private long rent_per_unit;
    private boolean has_electricity;
    private boolean has_water;
    private boolean has_internet;
    private String caretaker_name;
    private String caretaker_phone_number;
    private int landlord_id;

    public Property(){}

    @ParcelConstructor
    public Property(String name, String location, int number_of_units, long rent_per_unit, boolean has_electricity, boolean has_water, boolean has_internet, String caretaker_name, String caretaker_phone_number, int landlord_id) {
        this.name = name;
        this.location = location;
        this.number_of_units = number_of_units;
        this.rent_per_unit = rent_per_unit;
        this.has_electricity = has_electricity;
        this.has_water = has_water;
        this.has_internet = has_internet;
        this.caretaker_name = caretaker_name;
        this.caretaker_phone_number = caretaker_phone_number;
        this.landlord_id = landlord_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber_of_units() {
        return number_of_units;
    }

    public void setNumber_of_units(int number_of_units) {
        this.number_of_units = number_of_units;
    }

    public long getRent_per_unit() {
        return rent_per_unit;
    }

    public void setRent_per_unit(long rent_per_unit) {
        this.rent_per_unit = rent_per_unit;
    }

    public boolean isHas_electricity() {
        return has_electricity;
    }

    public void setHas_electricity(boolean has_electricity) {
        this.has_electricity = has_electricity;
    }

    public boolean isHas_water() {
        return has_water;
    }

    public void setHas_water(boolean has_water) {
        this.has_water = has_water;
    }

    public boolean isHas_internet() {
        return has_internet;
    }

    public void setHas_internet(boolean has_internet) {
        this.has_internet = has_internet;
    }

    public String getCaretaker_name() {
        return caretaker_name;
    }

    public void setCaretaker_name(String caretaker_name) {
        this.caretaker_name = caretaker_name;
    }

    public String getCaretaker_phone_number() {
        return caretaker_phone_number;
    }

    public void setCaretaker_phone_number(String caretaker_phone_number) {
        this.caretaker_phone_number = caretaker_phone_number;
    }

    public int getLandlord_id() {
        return landlord_id;
    }

    public void setLandlord_id(int landlord_id) {
        this.landlord_id = landlord_id;
    }


}

package com.moringaschool.rentbook.modules;

import java.util.ArrayList;

public class Utils {

    public static ArrayList<Property> getPropertyList(){
        ArrayList<Property> allProperty = new ArrayList<>();

        allProperty.add(new Property("Atlas", "Kajiado", 5, 21000, true, true, false, "Davy", "65865890"));
        allProperty.add(new Property("Pan", "Nairobi", 45, 1000, true, true, true, "George", "65865890"));
        allProperty.add(new Property("Kim flats", "Bungoma", 10, 2000, true, true, false, "Davy", "65865890"));
        allProperty.add(new Property("Robo height", "Eldoret", 56, 6000, true, true, true, "Davy", "65865890"));
        allProperty.add(new Property("Safe haven", "Nakuru", 52, 21500, true, true, true, "Davy", "65865890"));
        allProperty.add(new Property("Flat ten", "Kiambu", 15, 84000, true, true, false, "Davy", "65865890"));
        allProperty.add(new Property("Stima annex", "Narok", 53, 9000, true, true, false, "Davy", "65865890"));
        allProperty.add(new Property("Vextr", "Busia", 75, 27800, true, true, false, "Davy", "65865890"));

        return allProperty;
    }

    public static ArrayList<Tenant> getAllTenants(){
        ArrayList<Tenant> allTenants = new ArrayList<>();

        allTenants.add(new Tenant("Kevin","Kevin@gmail.com", "656565", "rh4u8", 12, "male", "Nurse", true, "1/3/2018", 23466, 8768, 5774, "3de", "Mango"));
        allTenants.add(new Tenant("Kleo","leo@gmail.com", "656565", "rh4u8", 12, "male", "Nurse", true, "1/3/2018", 23466, 8768, 5774, "3de", "Mango"));
        allTenants.add(new Tenant("Brian","bria@gmail.com", "656565", "rh4u8", 12, "male", "Nurse", true, "1/3/2018", 23466, 8768, 5774, "3de", "Mango"));
        allTenants.add(new Tenant("Caro","caro@gmail.com", "656565", "rh4u8", 12, "male", "Nurse", true, "1/3/2018", 23466, 8768, 5774, "3de", "Mango"));
        allTenants.add(new Tenant("Shirleen","shir@gmail.com", "656565", "rh4u8", 12, "male", "Nurse", true, "1/3/2018", 23466, 8768, 5774, "3de", "Mango"));
        allTenants.add(new Tenant("Omar","om@gmail.com", "656565", "rh4u8", 12, "male", "Nurse", true, "1/3/2018", 23466, 8768, 5774, "3de", "Mango"));
        allTenants.add(new Tenant("John","jo@gmail.com", "656565", "rh4u8", 12, "male", "Nurse", true, "1/3/2018", 23466, 8768, 5774, "3de", "Mango"));

        return allTenants;
    }
}

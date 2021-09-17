package com.moringaschool.rentbook.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.rentbook.R;
import com.moringaschool.rentbook.modules.Property;

import org.parceler.Parcels;

public class PropertyDetailFragment extends Fragment {

    Property property;

    TextView fragment_property_name,fragment_property_location,
          fragment_property_number_of_units_value,
          fragment_property_caretaker_name_value,
          fragment_property_caretaker_phone_number_value,
          fragment_property_rent_per_unit_value;



    public PropertyDetailFragment() {
        // Required empty public constructor
    }

    public static PropertyDetailFragment newInstance(Property property) {
        PropertyDetailFragment fragment = new PropertyDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("property_key", Parcels.wrap(property));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            property = Parcels.unwrap(getArguments().getParcelable("property_key"));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View v = inflater.inflate(R.layout.fragment_property_detail, container, false);

        fragment_property_name = (TextView) v.findViewById(R.id.fragment_property_name);
        fragment_property_location = (TextView) v.findViewById(R.id.fragment_property_location);
        fragment_property_number_of_units_value =(TextView) v.findViewById(R.id.fragment_property_number_of_units_value);
        fragment_property_caretaker_name_value = (TextView) v.findViewById(R.id.fragment_property_caretaker_name_value);
        fragment_property_caretaker_phone_number_value = (TextView) v.findViewById(R.id.fragment_property_caretaker_phone_number_value);
        fragment_property_rent_per_unit_value = (TextView) v.findViewById(R.id.fragment_property_caretaker_rent_per_unit_value);

        fragment_property_name.setText(property.getName());
        fragment_property_location.setText(property.getLocation());
        fragment_property_number_of_units_value.setText(property.getNumber_of_units());
        fragment_property_caretaker_name_value.setText(property.getCaretaker_name());
        fragment_property_caretaker_phone_number_value.setText(property.getCaretaker_phone_number());
        fragment_property_rent_per_unit_value.setText(Long.toString(property.getRent_per_unit()));



        return v;
    }
}
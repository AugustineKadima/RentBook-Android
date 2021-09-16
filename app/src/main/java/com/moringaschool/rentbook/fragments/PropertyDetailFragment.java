package com.moringaschool.rentbook.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.rentbook.R;

public class PropertyDetailFragment extends Fragment {

  TextView fragment_property_name,fragment_property_location,
          fragment_property_number_of_units_value,
          fragment_property_caretaker_name_value,
          fragment_property_caretaker_phone_number_value,
          fragment_property_rent_per_unit_value;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PropertyDetailFragment() {
        // Required empty public constructor
    }

    public static PropertyDetailFragment newInstance(String param1, String param2) {
        PropertyDetailFragment fragment = new PropertyDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
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

         return v;
    }
}
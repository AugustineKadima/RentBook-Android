package com.moringaschool.rentbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.rentbook.fragments.PropertyDetailFragment;
import com.moringaschool.rentbook.modules.Property;

import java.util.List;

public class PropertyPagerAdapter extends FragmentPagerAdapter {

    private List<Property> properties;

    public PropertyPagerAdapter(@NonNull FragmentManager fm, int behaviour, List<Property> properties) {
        super(fm, behaviour);
        this.properties = properties;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return PropertyDetailFragment.newInstance(properties.get(position));
    }

    @Override
    public int getCount() {
        return properties.size();
    }
}

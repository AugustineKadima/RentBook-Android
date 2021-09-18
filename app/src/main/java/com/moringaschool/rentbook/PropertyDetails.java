package com.moringaschool.rentbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.moringaschool.rentbook.adapters.PropertyPagerAdapter;
import com.moringaschool.rentbook.fragments.PropertyDetailFragment;
import com.moringaschool.rentbook.modules.Property;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PropertyDetails extends AppCompatActivity {

    @BindView(R.id.view_pager) ViewPager view_pager;
    private List<Property> properties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_details);

        ButterKnife.bind(this);

        properties = Parcels.unwrap(getIntent().getParcelableExtra("property_key"));
        int startingPosition = getIntent().getIntExtra("position", 0);
        PropertyPagerAdapter pagerAdapter = new PropertyPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, properties);
        view_pager.setAdapter(pagerAdapter);
        view_pager.setCurrentItem(startingPosition);


//        replaceFragment();
    }

//    public void replaceFragment(){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        PropertyDetailFragment propertyDetailFragment = new PropertyDetailFragment();
//        fragmentTransaction.replace(R.id.fragment_container, propertyDetailFragment);
//        fragmentTransaction.commit();
//    }
}
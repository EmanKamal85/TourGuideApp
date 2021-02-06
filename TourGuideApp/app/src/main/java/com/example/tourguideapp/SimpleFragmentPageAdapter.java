package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
    private Context context;

    public SimpleFragmentPageAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalFragment();
        } else if (position == 1) {
            return new SightsFragment();
        } else if (position == 2) {
            return new CulturalsFragment();
        } else {
            return new ReligiousFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.historical_tab);
        } else if (position == 1) {
            return context.getString(R.string.sights_tab);
        } else if (position == 2) {
            return context.getString(R.string.cultural_tab);
        } else {
            return context.getString(R.string.religious_tab);
        }
    }
}

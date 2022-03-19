package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int no_fragments;
    public TabsAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        no_fragments = tabCount;
    }
    @Override
    public int getCount() {
        return no_fragments;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ChatFragment home = new ChatFragment();
                return home;
            case 1:
                StatusFragment about = new StatusFragment();
                return about;
            case 2:
                CallFragment contact = new CallFragment();
                return contact;
            default:
                return null;
        }
    }

}

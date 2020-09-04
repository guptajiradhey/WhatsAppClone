package com.example.whatsappclone.ui.main;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import Fragments.ChatsFragment;
import Fragments.GroupChats;
import Fragments.ProfileFragment;

public class MyAdapters extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapters(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return  chatsFragment;
//                HomeFragment homeFragment = new HomeFragment();
//                return homeFragment;
            case 1:
                GroupChats groupChatfragment = new GroupChats();
                return  groupChatfragment;
//                SportFragment sportFragment = new SportFragment();
//                return sportFragment;
            case 2:
                ProfileFragment profileFragment = new ProfileFragment();
                return  profileFragment;
//                MovieFragment movieFragment = new MovieFragment();
//                return movieFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }

}

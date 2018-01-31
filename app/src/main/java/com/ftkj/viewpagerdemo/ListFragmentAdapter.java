package com.ftkj.viewpagerdemo;

/**
 * Created by FTKJ on 2018/1/31.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ccwxf on 2016/6/17.
 */
public class ListFragmentAdapter extends FragmentPagerAdapter{

    private List<ListFragment> fragments = new ArrayList<ListFragment>();
    private static final String[] CONTENT = new String[] { "Calendar", "Camera", "Alarms", "Location" };

    public ListFragmentAdapter(WrapContentViewPager viewPager, FragmentManager fm) {
        super(fm);

        fragments.add(new ListFragment(viewPager ,1));
        fragments.add(new ListFragment(viewPager, 2));
        fragments.add(new ListFragment(viewPager, 3));
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return CONTENT[position % CONTENT.length].toUpperCase();
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
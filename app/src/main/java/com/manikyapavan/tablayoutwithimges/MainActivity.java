package com.manikyapavan.tablayoutwithimges;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar1;
    TabLayout tabLayout;


    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AccountFragment(),"Item one");
        adapter.addFragment(new FavoriteFrament(),"Item two");
        adapter.addFragment(new RecentsFragment(),"Item Three");
        viewPager.setAdapter(adapter);
        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.account);
        tabLayout.getTabAt(1).setIcon(R.drawable.heart);
        tabLayout.getTabAt(2).setIcon(R.drawable.phone);

    }
}

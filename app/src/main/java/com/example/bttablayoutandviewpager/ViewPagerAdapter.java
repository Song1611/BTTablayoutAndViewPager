package com.example.bttablayoutandviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// Adapter cho ViewPager2
public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Trả về fragment tương ứng với vị trí tab
        switch (position) {
            case 0:
                return new ListFragment();
            case 1:
                return new GridFragment();
            case 2:
                return new StaggeredFragment();
            default:
                return new ListFragment();
        }
    }

    @Override
    public int getItemCount() {
        // Số lượng tabs
        return 3;
    }
}
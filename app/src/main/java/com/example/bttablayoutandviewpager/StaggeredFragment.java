package com.example.bttablayoutandviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

// Fragment cho tab Staggered Grid Layout
public class StaggeredFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        // Sử dụng StaggeredGridLayoutManager với 2 cột
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        // Tạo dữ liệu mẫu
        List<Item> items = createSampleData();
        StaggeredAdapter adapter = new StaggeredAdapter(items);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Item> createSampleData() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sunset Photography",
                "Beautiful golden hour shot at the beach with amazing colors reflecting on the water",
                "", "", "", "Nature", "456",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Urban Architecture",
                "Modern building design",
                "", "", "", "Architecture", "234",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Food Styling",
                "Delicious gourmet meal presentation with fresh ingredients, perfect lighting and artistic plating",
                "", "", "", "Food", "678",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Travel Inspiration",
                "Wanderlust moments from around the world",
                "", "", "", "Travel", "890",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Minimalist Interior",
                "Clean and simple home decor ideas with neutral colors, natural materials and functional design elements",
                "", "", "", "Design", "345",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Pet Portrait",
                "Adorable furry friend",
                "", "", "", "Animals", "567",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Fitness Goals",
                "Workout motivation and healthy lifestyle tips for achieving your fitness dreams",
                "", "", "", "Health", "234",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Art Collection",
                "Contemporary painting",
                "", "", "", "Art", "432",
                R.drawable.ic_launcher_foreground));
        return items;
    }
}

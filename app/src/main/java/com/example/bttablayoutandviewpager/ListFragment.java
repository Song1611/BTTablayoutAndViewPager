package com.example.bttablayoutandviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

// Fragment cho tab Linear Layout
public class ListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo dữ liệu mẫu
        List<Item> items = createSampleData();
        LinearAdapter adapter = new LinearAdapter(items);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Item> createSampleData() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Modern Smartphone",
                "Latest flagship with amazing features and stunning display",
                "Nov 15, 2025", "$999", "4.8", "Electronics", "245",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Wireless Earbuds",
                "Premium sound quality with active noise cancellation",
                "Nov 14, 2025", "$299", "4.6", "Audio", "189",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Smart Watch",
                "Track your fitness and stay connected on the go",
                "Nov 13, 2025", "$399", "4.7", "Wearables", "312",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Laptop Pro",
                "Powerful performance for professionals and creators",
                "Nov 12, 2025", "$1,499", "4.9", "Computers", "567",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Gaming Console",
                "Next-gen gaming experience with stunning graphics",
                "Nov 11, 2025", "$499", "4.8", "Gaming", "423",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Digital Camera",
                "Capture professional-quality photos and videos",
                "Nov 10, 2025", "$899", "4.7", "Photography", "198",
                R.drawable.ic_launcher_foreground));
        return items;
    }
}
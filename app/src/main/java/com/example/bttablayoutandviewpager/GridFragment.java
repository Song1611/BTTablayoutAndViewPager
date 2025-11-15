package com.example.bttablayoutandviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

// Fragment cho tab Grid Layout
public class GridFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        // Sử dụng GridLayoutManager với 2 cột
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        // Tạo dữ liệu mẫu
        List<Item> items = createSampleData();
        GridAdapter adapter = new GridAdapter(items);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Item> createSampleData() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sneakers", "Premium running shoes",
                "", "$129", "4.5", "Fashion", "89",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Backpack", "Stylish travel bag",
                "", "$79", "4.3", "Accessories", "67",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Sunglasses", "UV protection eyewear",
                "", "$159", "4.7", "Fashion", "123",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Water Bottle", "Insulated steel bottle",
                "", "$39", "4.6", "Sports", "234",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Yoga Mat", "Non-slip exercise mat",
                "", "$49", "4.4", "Fitness", "156",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Notebook", "Premium leather journal",
                "", "$29", "4.8", "Stationery", "78",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Coffee Mug", "Ceramic travel mug",
                "", "$25", "4.5", "Kitchen", "201",
                R.drawable.ic_launcher_foreground));
        items.add(new Item("Phone Case", "Protective cover",
                "", "$19", "4.2", "Accessories", "345",
                R.drawable.ic_launcher_foreground));
        return items;
    }
}
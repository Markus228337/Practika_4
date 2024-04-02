package com.example.practika4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class fragment_3 extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private RecyclerView.LayoutManager layout;

    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

       layout = new LinearLayoutManager(getContext());
       recyclerView.setLayoutManager(layout);

        String[] data = new String[200];
        for(int i = 0; i < 200; i++){
            data[i] = "Элемент " + (i + 1);
        }

        adapter = new MyAdapter(data);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

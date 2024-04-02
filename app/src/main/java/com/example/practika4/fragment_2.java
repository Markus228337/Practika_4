package com.example.practika4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_2 extends Fragment {

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        listView = view.findViewById(R.id.listView);

        String[] data = {"Чикаго Буллс", "Бостон Селтикс", "Шарлотт Хорнетс", "Голден Стейт", "Лос Анджелес Лейкерс", "Лос Анджелес Клипперс", "Денвер Наггетс", "Фила 76"};

        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Нажат элемент: " + data[position], Toast.LENGTH_SHORT).show();
                Log.d("fragment_2", "Нажат элемент: " + data[position]);
            }
        });
        return view;
    }
}

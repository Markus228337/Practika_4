package com.example.practika4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fragment_1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_1, container, false);

    Button buttonTofragment_2 = view.findViewById(R.id.button_to_fragment2);
    Button buttonTofragment_3 = view.findViewById(R.id.button_to_fragment3);

        buttonTofragment_2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new fragment_2());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        }
        });

        buttonTofragment_3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new fragment_3());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        }
        });

        return view;
    }
}
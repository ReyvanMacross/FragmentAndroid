package com.example.fragmentsederhana;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Button;

public class fragment_satu extends Fragment{
    Button btn_show;
    public fragment_satu(){
    //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_satu, container, false);

        btn_show = (Button) view.findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "INI ADALAH HASIL DARI BUTTON YANG DI KLIK!!", Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }}
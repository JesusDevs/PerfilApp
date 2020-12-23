package com.example.perfilapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.perfilapp.databinding.FragmentMessageBinding;

public class MessageFragment extends Fragment {
    private FragmentMessageBinding mbinding;

    public MessageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mbinding = FragmentMessageBinding.inflate(inflater,container,false);
        return mbinding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mbinding.contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbinding.msgHolder.setVisibility(view.VISIBLE);
                mbinding.EnviarMSJ.setVisibility(view.VISIBLE);
                mbinding.contactButton.setVisibility(view.GONE);
            }
        });
    }
}
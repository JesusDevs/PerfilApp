package com.example.perfilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.perfilapp.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {
    private ActivityContactBinding  mbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mbinding=ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());

        mbinding.imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent Implicito a el navegador
                String urls = "https://www.linkedin.com/in/leonardo-rodriguez-orellana-b6606a134/";
                Intent mIntentLinkIN = new Intent(Intent.ACTION_VIEW);
                mIntentLinkIN.setData(Uri.parse(urls));
                startActivity(mIntentLinkIN);
            }

        });
    }
}
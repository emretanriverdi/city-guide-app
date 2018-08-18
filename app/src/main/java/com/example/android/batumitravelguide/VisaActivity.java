package com.example.android.batumitravelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Objects;

public class VisaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa);
        setTitle("Visa Policy of Georgia");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

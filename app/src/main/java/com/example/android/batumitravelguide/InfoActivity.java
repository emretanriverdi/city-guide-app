package com.example.android.batumitravelguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Objects;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setTitle("General Info");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Typeface satisfyRegular = Typeface.createFromAsset(getAssets(),  "fonts/Satisfy-Regular.ttf");
        TextView textViewVisaPolicy = findViewById(R.id.text_visa_policy);
        textViewVisaPolicy.setTypeface(satisfyRegular);

        LinearLayout linearLayout = findViewById(R.id.layout_visa_policy);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InfoActivity.this, VisaActivity.class));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

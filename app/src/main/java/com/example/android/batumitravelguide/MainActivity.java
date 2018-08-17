package com.example.android.batumitravelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView generalInfo = findViewById(R.id.text_view_general_info);
        generalInfo.setOnClickListener(sendTo(InfoActivity.class));

        TextView localDishes = findViewById(R.id.text_view_local_dishes);
        localDishes.setOnClickListener(sendTo(FoodActivity.class));

        TextView historicalPlaces = findViewById(R.id.text_view_historical_places);
        historicalPlaces.setOnClickListener(sendTo(PlacesActivity.class));

        TextView usefulLinks = findViewById(R.id.text_view_useful_links);
        usefulLinks.setOnClickListener(sendTo(LinksActivity.class));
    }

    private View.OnClickListener sendTo(final Class className) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, className));
            }
        };
    }
}

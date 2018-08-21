package com.example.android.batumitravelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.Objects;

public class LinksActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle(R.string.useful_links);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        ItemList linksList = new ItemList();

        linksList.add(getString(R.string.link_tr_consulate));
        linksList.add(getString(R.string.link_bih));
        linksList.add(getString(R.string.link_wikipedia));
        linksList.add(getString(R.string.link_museums));
        linksList.add(getString(R.string.link_flights));
        linksList.add(getString(R.string.link_tours));
        linksList.add(getString(R.string.link_batumi));
        linksList.add(getString(R.string.link_statue));

        ItemAdapter linksAdapter = new ItemAdapter(this, linksList.get());
        ListView listView = findViewById(R.id.custom_full_list);
        listView.setDividerHeight(0);
        listView.setAdapter(linksAdapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

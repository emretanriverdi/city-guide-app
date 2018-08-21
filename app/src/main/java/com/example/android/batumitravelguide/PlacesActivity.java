package com.example.android.batumitravelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.Objects;

public class PlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle(R.string.historical_places);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        ItemList placesList = new ItemList();

        placesList.add(getString(R.string.ali_nino), getString(R.string.ali_nino_text), R.drawable.historical_ali_nino);
        placesList.add(getString(R.string.alphabetical_chacha_towers), getString(R.string.alphabetical_chacha_towers_text), R.drawable.historical_alphabetical_chacha_towers);
        placesList.add(getString(R.string.gonio_castle), getString(R.string.gonio_castle_text), R.drawable.historical_gonio_castle);
        placesList.add(getString(R.string.medea), getString(R.string.medea_text), R.drawable.historical_medea);
        placesList.add(getString(R.string.ters_ev), getString(R.string.ters_ev_text), R.drawable.historical_ters_ev);
        placesList.add(getString(R.string.piazza), getString(R.string.piazza_text), R.drawable.historical_piazza);
        placesList.add(getString(R.string.st_nicholas), getString(R.string.st_nicholas_text), R.drawable.historical_st_nicholas);
        placesList.add(getString(R.string.virgin_mary), getString(R.string.virgin_mary_text), R.drawable.historical_virgin_mary);

        ItemAdapter placesAdapter = new ItemAdapter(this, placesList.get());
        ListView listView = findViewById(R.id.custom_full_list);
        listView.setAdapter(placesAdapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

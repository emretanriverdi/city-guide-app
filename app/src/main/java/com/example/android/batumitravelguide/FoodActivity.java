package com.example.android.batumitravelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.Objects;

public class FoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle(getString(R.string.local_dishes));

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        ItemList foodList = new ItemList();

        foodList.add(getString(R.string.chvishtari), getString(R.string.chvishtari_text), R.drawable.food_chvishtari);
        foodList.add(getString(R.string.pkhali), getString(R.string.pkhali_text), R.drawable.georgian_walnut_salad);
        foodList.add(getString(R.string.georgian_kebab), getString(R.string.georgian_kebab_text), R.drawable.food_georgian_kebab_with_sour_plum_sauce);
        foodList.add(getString(R.string.khachapuri), getString(R.string.khachapuri_text), R.drawable.food_khachapuri);
        foodList.add(getString(R.string.trout), getString(R.string.trout_text), R.drawable.food_trout);
        foodList.add(getString(R.string.eggplant_walnut_rolls), getString(R.string.eggplant_walnut_rolls_text), R.drawable.food_eggplant_walnut_rolls);
        foodList.add(getString(R.string.kharcho), getString(R.string.kharcho_text), R.drawable.food_kharcho);
        foodList.add(getString(R.string.borjomi), getString(R.string.borjomi_text), R.drawable.food_borjomi);

        ItemAdapter foodAdapter = new ItemAdapter(this, foodList.get());
        ListView listView = findViewById(R.id.custom_full_list);
        listView.setAdapter(foodAdapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

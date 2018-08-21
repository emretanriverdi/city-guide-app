package com.example.android.batumitravelguide;

import java.util.ArrayList;

public class ItemList {
    private ArrayList<Item> arrayList = new ArrayList<>();

    public void add(String title, String text, int image) {
        arrayList.add(new Item(title, text, image));
    }

    public void add(String title) {
        arrayList.add(new Item(title));
    }

    public ArrayList<Item> get() {
        return arrayList;
    }
}

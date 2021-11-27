package com.example.mail_app_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item> items;

    public static final String NAME_1 ="Anna Smith";
    public static final String NAME_2 ="Adobe Creative Cloud Updates";
    public static final String NAME_3 ="Jhon Doe";
    public static final String NAME_4 ="Kelsey Green";
    public static final String NAME_5 ="Space News Latest Update";
    public static final String NAME_6 ="Anna Smith";
    public static final String NAME_7 ="Android Blog Daily Post";
    public static final String NAME_8 ="Google Team";

    public static final String HEADER_1 ="The new iconic creator heare !";
    public static final String HEADER_2 ="Help make Campain Monitor better ";

    public static final String CONTENT ="Announcing the all-new creator, builder in...";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add(new Item(NAME_1, HEADER_1, CONTENT));
        items.add(new Item(NAME_2, HEADER_2, CONTENT));
        items.add(new Item(NAME_3, HEADER_2, CONTENT));
        items.add(new Item(NAME_4, HEADER_1, CONTENT));
        items.add(new Item(NAME_5, HEADER_1, CONTENT));
        items.add(new Item(NAME_6, HEADER_2, CONTENT));
        items.add(new Item(NAME_7, HEADER_1, CONTENT));
        items.add(new Item(NAME_8, HEADER_2, CONTENT));
        items.add(new Item(NAME_1, HEADER_1, CONTENT));
        items.add(new Item(NAME_8, HEADER_1, CONTENT));
        items.add(new Item(NAME_5, HEADER_1, CONTENT));
        items.add(new Item(NAME_2, HEADER_2, CONTENT));
        items.add(new Item(NAME_6, HEADER_2, CONTENT));
        items.add(new Item(NAME_4, HEADER_2, CONTENT));
        items.add(new Item(NAME_7, HEADER_1, CONTENT));
        items.add(new Item(NAME_6, HEADER_1, CONTENT));

        ItemAdapter adapter = new ItemAdapter(items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
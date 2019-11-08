package ru.ostinalex.shopcard01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] countries = { "Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай"};
        setContentView(R.layout.activity_main);
        // получаем элемент ListView
//        ListView countriesList = (ListView) findViewById(R.id.countriesList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);

        // устанавливаем для списка адаптер
//        countriesList.setAdapter(adapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, ShopCardItem.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = findViewById(R.id.list_item);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(itemClickListener);

    }
}

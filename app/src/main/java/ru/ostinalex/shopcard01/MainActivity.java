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
        String[] mainItems = {"Просмотр", "Добавление", "Удаление"};
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mainItems);
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
        listView.setOnItemClickListener(itemClickListener);
    }
}

package ru.ostinalex.shopcard01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShopCardItem extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    ListView listCard = getListView();
    ArrayAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ShopCard.shopcards);
    listCard.setAdapter(listAdapter);

    }
}

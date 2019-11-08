package ru.ostinalex.shopcard01;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StoreCardActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    ListView listCard = getListView();
    ArrayAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, StoreCard.cards);
    listCard.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(StoreCardActivity.this, CardActivity.class);
        intent.putExtra(CardActivity.EXTRA_CARD,(int)id );
        startActivity(intent);
    }
}

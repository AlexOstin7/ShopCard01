package ru.ostinalex.shopcard01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardActivity extends AppCompatActivity {
public static String EXTRA_CARD = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        int cardId = (Integer) getIntent().getExtras().get(EXTRA_CARD);
        StoreCard card = StoreCard.cards[cardId];
        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(card.getCardBarCodeImageId());
        TextView textView = findViewById(R.id.name);
        textView.setText(card.getName());

    }
}

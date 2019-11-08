package ru.ostinalex.shopcard01;

import androidx.annotation.NonNull;

public class StoreCard {
    private String name;
    private int cardBarCodeImageId;

    public StoreCard(String name, int imageId) {
        this.name = name;
        this.cardBarCodeImageId = imageId;
    }

    public static final StoreCard[] cards = {
            new StoreCard("Пятёрочка", R.drawable.pyaterochka7789004934138748),
            new StoreCard("Перекрёсток", R.drawable.perekrestok7789007251461999),
            new StoreCard("Фамилия", R.drawable.famiya9911045894534)
    };

    public String getName() {
        return name;
    }

    public int getCardBarCodeImageId() {
        return cardBarCodeImageId;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}

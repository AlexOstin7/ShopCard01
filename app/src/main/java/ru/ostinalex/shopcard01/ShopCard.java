package ru.ostinalex.shopcard01;

import androidx.annotation.NonNull;

public class ShopCard {
    private String name;
    private int imageId;

    public ShopCard(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public static final ShopCard[] shopcards = {
            new ShopCard("Пятёрочка", R.drawable.pyaterochka7789004934138748),
            new ShopCard("Перекрёсток", R.drawable.perekrestok7789007251461999),
            new ShopCard("Фамилия", R.drawable.famiya9911045894534)
    };

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}

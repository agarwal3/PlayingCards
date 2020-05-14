package com.example.playingcards;

import android.graphics.Bitmap;

public class Card
{
    private Bitmap cardImage;
    private int id;
    private int cardX;
    private int cardY;

    public Card(int id, Bitmap cardImage, int cardX, int cardY)
    {
        this.id = id;
        this.cardImage = cardImage;
        this.cardX = cardX;
        this.cardY = cardY;
    }

    public Bitmap getCardImage() {
        return cardImage;
    }

    public int getId() {
        return id;
    }

    public int getCardX() {
        return cardX;
    }

    public int getCardY() {
        return cardY;
    }

    public void setCardImage(Bitmap cardImage) {
        this.cardImage = cardImage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCardX(int cardX) {
        this.cardX = cardX;
    }

    public void setCardY(int cardY) {
        this.cardY = cardY;
    }
}

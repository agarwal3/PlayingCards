package com.example.playingcards;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;

import java.util.List;

public class GameView extends SurfaceView implements Runnable
{

    private int screenWidth;
    private int screenHeight;

    private int cardWidth;
    private int cardHeight;

    private Bitmap bitmapCardFront;
    private Bitmap bitmapCardBack;
    private Bitmap bitmapCardBackScaled;

    private List <Card> deck;


    public GameView(Context context, int screenWidth, int screenHeight)
    {
        super(context);

        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;



    }

    @Override
    public void run()
    {

    }

    public void pause()
    {

    }

    public void resume()
    {

    }

}

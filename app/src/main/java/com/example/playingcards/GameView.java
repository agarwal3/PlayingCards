package com.example.playingcards;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.ArrayList;
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
    private Bitmap singleCard;

    private SurfaceHolder surfaceHolder;

    private List <Card> deck;

    volatile  boolean playing;

    Thread thread = null;


    public GameView(Context context, int screenWidth, int screenHeight)
    {
        super(context);

        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        surfaceHolder = getHolder();

    }

    public void seperate(Context context)
    {
        bitmapCardFront = BitmapFactory.decodeResource(context.getResources(), R.drawable.card_fronts);
        bitmapCardBack = BitmapFactory.decodeResource(context.getResources(), R.drawable.card_back);

        cardWidth = bitmapCardFront.getWidth() / 13;
        cardHeight = bitmapCardFront.getHeight() / 4;

        bitmapCardBackScaled = Bitmap.createScaledBitmap(bitmapCardBack,cardWidth,cardHeight,true);
    }

    public void seperateCards()
    {
        int initialWidth = 0;
        int initialHeight = 0;
        int id = 1;
        // Bitmap singleCard;

        deck = new ArrayList<>();

        for(int i = 0; i < 4; i ++)
        {
            for (int j = 0; j < 13; j ++)
            {
                singleCard = Bitmap.createBitmap(bitmapCardFront, initialWidth, initialHeight, cardWidth, cardHeight);

                id = (i * 100) + j + 101;

                Card card = new Card(id, singleCard,-500, -500);
                deck.add(card);

                initialWidth = j * cardWidth + cardWidth;
            }
            initialWidth = 0;
            initialHeight = i * cardHeight + cardHeight;
        }

    }

    @Override
    public void run()
    {
        while (playing)
        {
            update();
            draw();
            control();
        }

    }

    public void update()
    {

    }

    public void draw()
    {

    }

    public void control()
    {
        try
        {
            thread.sleep(17);
        }
        catch (InterruptedException e)
        {

        }
    }

    public void pause()
    {
        playing = false;
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {

        }
    }

    public void resume()
    {
        playing = true;
        thread = new Thread(this);
        thread.start();
    }

}

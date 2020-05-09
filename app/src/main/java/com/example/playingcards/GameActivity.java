package com.example.playingcards;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class GameActivity extends Activity
{

    protected GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();

        display.getSize(point);
        gameView = new GameView(this, point.x, point.y);
        setContentView(gameView);
    }

    protected void onPause()
    {
        super.onPause();
        gameView.pause();
    }

    protected void onResume()
    {
        super.onResume();
        gameView.resume();
    }
}

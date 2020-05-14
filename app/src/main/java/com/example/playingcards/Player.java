package com.example.playingcards;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private List <Card> player;

    public Player()
    {
        player = new ArrayList<>();
    }

    public List<Card> getPlayer()
    {
        return player;
    }
}

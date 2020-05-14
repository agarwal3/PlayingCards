package com.example.playingcards;

import java.util.ArrayList;
import java.util.List;

public class Opponent
{
    private List <Card> opponentList;

    public Opponent()
    {
        opponentList = new ArrayList<>();
    }

    public List<Card> getOpponentList()
    {
        return opponentList;
    }
}

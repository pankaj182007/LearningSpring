package com.learn.learn_spring;

import game.GameRunner;
import game.MarioGame;
import game.PacmanGame;
import game.SupercontraGame;

public class AppGameingBasic {
    public static void main(String[] arg)
    {
       // var game =new MarioGame();
       // var game=new SupercontraGame();
        var game=new PacmanGame();
        var gameRunner=new GameRunner(game);
        gameRunner.run();


    }

}

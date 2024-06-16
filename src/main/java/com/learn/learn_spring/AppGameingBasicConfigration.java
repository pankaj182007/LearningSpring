package com.learn.learn_spring;


import game.GameRunner;
import game.GameingConsole;
import game.MarioGame;
import game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGameingBasicConfigration {

    @Bean
    public GameingConsole game()
    {
        var game=new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GameingConsole game)
    {
        return new GameRunner(game);
    }
}

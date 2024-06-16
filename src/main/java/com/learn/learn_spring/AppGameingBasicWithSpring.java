package com.learn.learn_spring;

import game.GameRunner;
import game.GameingConsole;
import game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGameingBasicWithSpring {
    public static void main(String[] arg)
    {
       // var game =new MarioGame();
       // var game=new SupercontraGame();
        try(var context= new AnnotationConfigApplicationContext(AppGameingBasicConfigration.class)) {
            // var game=new PacmanGame();
            context.getBean(GameingConsole.class).left();
            context.getBean(GameRunner.class).run();

        }


    }

}

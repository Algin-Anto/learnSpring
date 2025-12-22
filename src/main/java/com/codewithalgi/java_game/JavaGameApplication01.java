package com.codewithalgi.java_game;

import com.codewithalgi.java_game.game.GameRunner;
import com.codewithalgi.java_game.game.GamingConfiguration;
import com.codewithalgi.java_game.game.GamingConsole;
import com.codewithalgi.java_game.game.PacMan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaGameApplication01 {

    public static void main(String[] args) {
       var context=new AnnotationConfigApplicationContext(GamingConfiguration.class);
       context.getBean(GamingConsole.class).up();
//		var game=new MarioGame();
//		var game=new SuperContraGame();
//        var game = new PacMan();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }

}

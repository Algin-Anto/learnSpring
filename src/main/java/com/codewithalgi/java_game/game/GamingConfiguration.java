package com.codewithalgi.java_game.game;



import com.codewithalgi.java_game.game.GameRunner;
import com.codewithalgi.java_game.game.GamingConfiguration;
import com.codewithalgi.java_game.game.GamingConsole;
import com.codewithalgi.java_game.game.PacMan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacMan();
        return game;
    }

    @Bean
    public GameRunner GameRunner(GamingConsole game
    ) {
        var gameRunner = new GameRunner(game);
        return  gameRunner;
    }
    //		var game=new MarioGame();
//		var game=new SuperContraGame();
//    var game = new PacMan();
//    var gameRunner = new GameRunner(game);
//		gameRunner.run();
}

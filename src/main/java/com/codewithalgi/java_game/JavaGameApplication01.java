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
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

        }
    }
}

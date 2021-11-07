package com.example.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SimpleApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		//Game mario = new SuperContraGame();
		
		//GameRunner game = new GameRunner(mario);
		
		//game.runGame();
		
		runner.runGame();
	}

}

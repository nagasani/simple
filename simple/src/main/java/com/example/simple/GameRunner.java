package com.example.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	private Game game;

	public GameRunner(Game game) {
		System.out.println("Using Constructor");
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.right();
		game.left();
	}
	
}

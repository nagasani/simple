package com.example.simple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game {
	
	@Override
	public void up() {
		System.out.println("up");
	}
	
	@Override
	public void down() {
		System.out.println("down");
	}
	
	@Override
	public void right() {
		System.out.println("right");
	}
	
	@Override
	public void left() {
		System.out.println("left");
	}	

}

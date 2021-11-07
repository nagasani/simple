package com.example.simple.flow;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataController{
	
	public List<Integer> retrieveData() {
		return Arrays.asList(12,34,28,95,105);
	}
}

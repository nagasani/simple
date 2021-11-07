package com.example.simple.flow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessController{
	
	@Autowired
	private DataController dt;
	
	public long calulateSum() {
		List<Integer> data = dt.retrieveData();
		
		return data.stream().reduce(Integer :: sum).get();
	}
}
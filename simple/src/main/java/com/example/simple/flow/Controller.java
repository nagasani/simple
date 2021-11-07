package com.example.simple.flow;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	BusinessController bus;
	
	@GetMapping("/sum")
	public long displaySum() {
		return bus.calulateSum(); 	
	}

}

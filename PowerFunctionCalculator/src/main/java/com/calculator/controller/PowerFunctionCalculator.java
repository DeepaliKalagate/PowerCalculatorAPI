package com.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.calculator.dto.PowerFunctionNumberDTO;
import com.calculator.service.PowerFunctionService;

@RequestMapping("/calculator")
@RestController
public class PowerFunctionCalculator
{
	@Autowired
	PowerFunctionService service;
	@PostMapping("/calculate")
	public int calculator(@RequestBody PowerFunctionNumberDTO numberDTO) 
	{	
		int responseResult = service.calculator(numberDTO);
		return responseResult;
	}
}
package com.calculator.service;

import org.springframework.stereotype.Service;

import com.calculator.dto.PowerFunctionNumberDTO;

@Service
public class PowerFunctionService implements IPowerFunction 
{

	@Override
	public int calculator(PowerFunctionNumberDTO numberDTO) 
	{
		int firstNumber = numberDTO.getFirstNumber();
		int secondNumber = numberDTO.getSecondNumber();

		System.out.println(firstNumber);
		System.out.println(secondNumber);

		int result = 1;

		for (int i = 1; i <= secondNumber; i++) 
		{
			result = result * firstNumber;
		}
		System.out.println(result);
		return result;
	}

}

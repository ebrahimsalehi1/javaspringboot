package com.ebi.salehi.fx.TestHosco;

import java.util.function.Function;

public class LambdaTest {

	public static void main(String[] args) {
		
		MathOperations mathOperations;
		mathOperations = (a,b) -> a+b;
		//System.out.println(mathOperations.add(100, 200));
		PrintResult printResult = () -> System.out.println("result:"+mathOperations.add(200, 300));
		printResult.displayRes();
		
		Function<String, String> func1 = Function.identity();
		System.out.println(func1.apply("java 8"));
	}

}

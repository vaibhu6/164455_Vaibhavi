package com.lambda.three;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaClass {

	public static void main(String[] args) {
		String str="Vaibhavi";
		
		Consumer<String> cons =(arg)->{};
		cons.accept(str);
		Supplier<String> sup =() ->str;
		System.out.println(sup.get());
		Predicate<Integer> pred= a->(a>20);
		System.out.println(pred.test(30));
		Function<Integer, Integer> fun= a-> a*a;
		System.out.println(fun.apply(2));
	}
}

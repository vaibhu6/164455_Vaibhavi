package com.lambda.one;

@FunctionalInterface
public interface Addition {
	int add(int a, int b);
}
@FunctionalInterface
interface Subtract {
	int sub(int a, int b);
}
@FunctionalInterface
interface Multiply {
	int mul(int a, int b);
}
@FunctionalInterface
interface Divide {
	int div(int a, int b);
}

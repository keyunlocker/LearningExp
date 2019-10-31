package javalearning.overloading;

public class OverloadingClass {
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(int a , double b) {
		System.out.println(a+b);
	}
}

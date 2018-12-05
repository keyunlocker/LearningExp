package javalearning;

/**
 * member varible 
 * @author key
 *
 */
public class ScopeOfVariable {
	//all varible define in the class any where but not in method and constructor 
	//are member variable
	int a;
	String b;
	//access specifier doesn't play any role for the scope of the variable within 
	// the class
	//outside the class it plays the role
	private String c="private";//no package no sub-class no world 
	public String d="public";//everywhere
	protected String e="protected";//yes package yes sub-class no world
	String f="default";//yes package no subclass no world
	public int con=10;
	
	// if we define the parameterized constructor then we need to define constructor in the subclass calling the super class from it
	public ScopeOfVariable() {
		System.out.println("scope of variable");
	}
	
	
	//local variable (Method level scope)
	public static void main(String args[]) {
		int method_scope=0;//scope is only till this method
		if(true) {
			int inner_function=9;//this has block scope
			System.out.println(method_scope);
			method_scope=7;
		}
		//System.out.println(inner_function);//compile time error scope nahi hai
		System.out.println(method_scope);
	}

}



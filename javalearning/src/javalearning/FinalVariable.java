package javalearning;

public class FinalVariable {
	
	final int i=10;//it can be assigned only once either in declaration 
	//or later in the constructor
	final int j;
	public FinalVariable() {
		this.j=10;
	}
	//if we have more than one constructor than in all constructor we need to 
	//initialize the final variable. 
	public FinalVariable(int a) {
		this.j=a;
	}
	
	//this is constructor chaining ,in this calling constructor should be the first
	//line and after that line there should not be initializing of the final variable
	//and there should be atleast one constructor in which initializing of the final
	//variable is done.
	public FinalVariable(int a ,int b) {
		this(a);
	}
	
	
	//blank final variable is used to create the immutable object whose value won't be changed only new object with
	//new value scenario is possible as the constructor will be initializing the final variable
}

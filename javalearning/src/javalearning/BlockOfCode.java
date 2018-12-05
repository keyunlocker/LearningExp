package javalearning;

/**
 * 
 * 
 * 
 * @author key
 *
 */
public class BlockOfCode {
	
	int i=0;
	static int j=0;
	
	//the static block get executed once
	//it will get executed when ever u access any static variable or method
	//it will get executed when u create object 
	//it will get executed before the constructor or before the static variable or static method 
	static{
		j++;
		System.out.println("Inside Static block  "+j);
	}
	
	//this block which is not static will execute only when the object is getting created before the constructor
	//if constructor is getting called then only this block will get called before the constructor
	{
		System.out.println("Block");
		
	}
	
	public void printClassDetails() {
		System.out.println("i "+ this.i + " j " + j );
		//this block won't get executed before  above line
		{
			System.out.println("method block");
		}
	}
	
	public static void checkStaticBlock() {
		System.out.println("checkStaticBlock");
	}

}

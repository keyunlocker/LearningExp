package javalearning;

import java.io.Serializable;

/**
 * 
 * In order to clone any object we need to implement cloneable interface 
 * @author key
 *
 */
public class PojoBeans implements Cloneable,Serializable{
	private String name;
	private static int i=0;
	
	//if constructor is getting called then only this block will get called before the constructor
	{
		System.out.println("Block");
		
	}
	
	public PojoBeans() {
		this.i++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printClassName() {
		System.out.println("PojoBeans   "+this.i+"  hashcode  "+ this.hashCode());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

package javalearning;

/**
 * In this lesson we ll be learning about the variable .
 * So there are three type of variable
 *  
 * 1.Local variable -scope till the method or block or constructor
 * 
 * 2.Instance variable-which is defined in the class but outside the method or block or constructor,we can provide access specifier,
 * it has scope through out the class and this variable will be holding the data per instance and we can access this variable through instance
 *  
 * 3.Static Variable- which is same as the class variable or instance variable but it has the key word as static which give the fixed memory
 * location for all the instance got created for that class and we can access it through class name directly also and this varible are getting 
 * created at start of the program and destroy at the end of the program
 * 
 * 
 * @author key
 *
 */
public class LessonTwo {
	static String a="static variable";//static varible
	String b;//class variable
	 LessonTwo(String b){
		 System.out.println(a);
		 this.b=b;
		 System.out.println(this.b);
	 }
	  
	 /**
	  * l1,l2,l3,l4,l5 are local variable 
	 * @param args
	 */
	public static void main(String args[]) {
		 LessonTwo l1= new LessonTwo("One");
		 l1.a="static variable change";
		 LessonTwo l2= new LessonTwo("two");
		 LessonTwo l3= new LessonTwo("three");
		 LessonTwo l4= new LessonTwo("four");
		 LessonTwo l5= new LessonTwo("five");
	 }
	 
}

/*
 * Output
static variable
One
static variable change
two
static variable change
three
static variable change
four
static variable change
five

 * */


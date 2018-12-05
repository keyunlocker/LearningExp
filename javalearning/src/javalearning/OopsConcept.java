package javalearning;

/**
 * This is the example of the oops which are 
 * 1.class- it is a prototype from which the object is created 
 * 
 * 2.object- insatnce of the  class
 * 
 * 3.Inheritance- used for the re-usability 
 * 
 * 4.Encapsulation-wrapping up the data in the single unit.Data in the class is hidden from the other class isliya
 * data hiding bhi bolta hai.variable or data jo sirf class k method hi access kar sakta hai.achiv karna k liya
 * simple hai ,variable jo hai define karo private so varibale sirf access hoga us class mai jaha wo define hua hai
 * 			1.Data hiding
 * 			2.increased flexibility
 * 			3.Reusability
 * 			4.Testing code is easy
 * 
 * 5.Abstraction-only essential details are displayed to user
 * famous example hai gisma we drive car but we don't know what all are the component which is responsible for the car to move.
 * java mai abstraction 2 ways sa achiev kar sakta hai
 * abstration is implementation hiding
 * 				1.interface -
 * 1.it can have abstract method as well as the default method and static method 
 * 2.it is the blue print of the class
 * 3.static method can be called directly without any object 
 * 4.varibale in the interface are final
 * 5.multiple interface can extend each other not like the class.
 *				2.abstract class -
 *1.abstract keyword use karna retha hai
 *2.isma concret method as well as method without implementation bhi hota hai but method which is not having any implementation
 *must be prefied by the keyword abstract and it should be given implementation in other subclass if it is not an abstract class
 *3.abstract class k object jabhi banta hai tab uska jitan bhi abstact method hai usko override karna hota hai therefore iska explicit koi
 *instance nahi ban raha hai 
 *4. variable in the abstract class are non-final.
 *						Abstract class vs interface
 *	1.abstract mai abstract and no abstract method define kar sakta hai mean method with implementation and method without implementation but 
 *in interface also we can define method with implementation and without but the without one should be only static and default one.
 * 2.abstarct can have final or non- final type of variable where as interface will have only final type of variable.
 * 3.abstract class can give implementation to the interface but the interface can't give the implementation to the abstract class
 * 4.class can have only one abstract class extended but interface can be implemented more.
 * 
 * 6.Polymorphism
 * 1.Run time and compile time polymorphism - run time is overriding and compile time is overloading
 * 2.jab bhi super class k reference sa overriden method call hota hai then all it is depend on the object what is created no to the 
 * refernce that is what resolved at the run time.
 * 3.varible k liya overriding nahi hota hai to refernce variable k hi variable call hoga
 * 4. static binding and dynamic binding  -static binding is at the compile time and dynamic binding is at the run time
 * 	private,final,static and variable are following the static binding so bounded hai with the compiler where as overriding jo hai
 * bounded hai with the run time.
 * 
 * 7.Association
 * relation between classes jo establish hota hai through the object.
 * 8.Aggregation
 * it is one way relation where both object can survive with other entity or object 
 * example departmaent and student..department will have list of student but vice versa is not possible
 * 9.Composition
 * relation between object where both can't exist without other entity or object
 * classic example is like book class and library class.
 * 
 * 
 * @author key
 *
 */
public class OopsConcept {
	
	public static void main(String args[]) {
		OopsConcept oopsConcept= new  OopsConcept();//object example 
		oopsConcept.printName("Animesh");
		Ninja ninja= new Ninja("Kawasaki", 156, 400, 6);
		ninja.printNinjaDetails();
		//example of encapsulation :- we can not use ninja.brand jadi merako brand access karna hai to mujha 
		//brand k method call karna hoga jo public defined hai
		ninja.printBrand();
		Shape shape= new Circle("red", 2);
		shape.area();//Implementation hiding 
		
		
		//Association- student or school mai relation hai
		School sc= new School("St.Francis school");
		Student st= new Student("Animesh");
		System.out.println(st.getStudenName()+" is from "+ sc.getSchoolName());
	}

	
	public void printName(String name) {
		System.out.println("My Name is ::" + name);
	}
}

class Bike {
	
	int topSpeed;
	int gear;
	int cc;
	
	Bike(){
		super();
	}
	
	Bike(int topSpeed,int gear,int cc){
		this.topSpeed=topSpeed;
		this.gear=gear;
		this.cc=cc;
	}
	
	public void topSpeed() {
		System.out.println("topSpeed-"+this.topSpeed);
	}
	
	public void printGear() {
		System.out.println("Gear-"+this.gear);
	}
	
	public void printCC() {
		System.out.println("CC-"+ this.cc);
	}
	
}

/**
 * 
 * One class can extends only one class but suppose
 * Class D extends Class C
 * Class C extends Class B
 * Class B extends Class A 
 * 
 * therefore Class D inherit the C,B,A
 * @author key
 *
 */
class Ninja extends Bike{
	private String brand;
	
	Ninja(String brand,int topSpeed,int cc,int gear){
		super(topSpeed, gear, cc);
		this.brand=brand;
	}
	
	public void printBrand() {
		System.out.println("Brand Name-"+this.brand);
	}
	
	public void printNinjaDetails() {
		System.out.println(brand+" "+topSpeed+" "+cc+" "+gear);
	}
}


abstract class Shape{
	String colour;
	
	abstract void area();
	
	Shape(String colour){
		this .colour=colour;
	}
	
	public void printColour() {
		System.out.println("the colour of the shape-"+this.colour);
	}
}


class Circle extends Shape{
	int raidus;
	Circle(String colour,int radius) {
		super(colour);
		this.raidus=radius;
		
	}

	@Override
	void area() {
		System.out.println(3.14*this.raidus);
	}
	
}


/*
 * same like the abstract class if interface are extending each other then no need to give the implementation to the method which is being
 * extended by the sub interface . 
 */
interface A{
	void aKaMethod();
}

interface B{
	void bKaMethod();
}

interface C extends A,B{
	void cKaMethod();
}

class InterfaceExample implements C{

	@Override
	public void aKaMethod() {
		System.out.println("A");
		
	}

	@Override
	public void bKaMethod() {
		System.out.println("B");
		
	}

	@Override
	public void cKaMethod() {
		System.out.println("C");
		
	}
	
}

class School{
	private String name;
	School(String name){
		this.name= name;
	}
	
	public String getSchoolName() {
		return this.name;
	}
}

class Student{
	private String name;
	Student(String name){
		this.name= name;
	}
	public String getStudenName() {
		return this.name;
	}
}

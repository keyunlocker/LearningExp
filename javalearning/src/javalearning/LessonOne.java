package javalearning;

/**
 *1:abc9_$ -variable
 *2: short,int,long ,float,double,byte,boolean,char ya sab primitive data type.
 *3:enum
 *	we can pass enum in switch
 *	it has 3 method valueOf(),Ordinal(),values()
 * 	it can have constructor and it will be called for each enum constant
 * 
 * StringBuffer.appendCodePoint()- it just append the argument which we pass as argument with it corresponding unicode.
 * 
 * @author key
 *
 */
public class LessonOne {
	private int abc9_$=0;//variable name can be from a-z,A-Z,0-9 and $,_ but it should not start with numner
	//private int 99assd=0;//wrong it should not start with number
	private int $abc=0;//correct
	private int _abc=0;//correct
	/*
	 * private int while=0;//wrong because while is an reserved word ,there are 53 reserved word in java they are categories as
	 * keywords and literals 
	 */
	 
	/**
	 * it is internally creating class Bike
	 * public static final Bike duke=new Bike();
	 * @author key
	 *
	 */
	enum Bike{
		duke("KTM"),rc,ns,rs;
		private String brand;
		Bike(){
			System.out.println("Constructor "+ this);
			System.out.println("Constructor Name"+ this.toString());
		}
		Bike(String brand){
			this.brand=brand;
			
		}
		public String getBrand() {
			return this.brand;
		}
	}
	
	public static void main(String args[]) {
		Bike b=Bike.duke;
		System.out.println(b);
		System.out.println(b.getBrand()+"  "+ b.name());
		
		StringBuffer sb= new StringBuffer(b.getBrand());
		sb.appendCodePoint(65);//the value you pass that it refer to the unicode point
		System.out.println(sb);//expected result will be KTMA in this A got appended at the end
	}
	

}

enum Car{
	swift,alto,sumo,nano,bently;
	
	public static void main(String args[]) {
		Car c=Car.alto;
		Car car[]=Car.values();
		for(Car cr:car) {
			System.out.println(cr+" index "+ cr.ordinal());			
		}
		System.out.println(Car.valueOf("nano"));
		System.out.println(c);
	}
}
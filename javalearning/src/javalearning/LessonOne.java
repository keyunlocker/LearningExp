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
 * keyword and literal-keyword which define functionality where as literal define value like true ,false ,null 
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
	Bike bike;
	enum Bike{
		//duke is define with the single parameter constructor 
		duke("KTM","ABS"),rc("Bajaj"),ns,rs;/*so this prove that we can have constructor define and each constant
		is behaving as the class like Bike duke= new Duke("KTM","ABS") and so on*/ 
		private String brand;
		private String feature;
		Bike(){
			System.out.println("Constructor "+ this);
			System.out.println("Constructor Name"+ this.toString());
		}
		
		Bike(String brand){
			this.brand=brand;
			
		}
		
		Bike(String brand,String feature){
			this.brand=brand;
			this.feature=feature;
		}
		public String getBrand() {
			return this.brand;
		}
		
		public String getFeature() {
			return this.feature;
		}
	}
	
	public static void main(String args[]) {
		Bike b=Bike.duke;
		System.out.println(b);
		System.out.println(b.getBrand()+"  "+ b.name());
		
		StringBuffer sb= new StringBuffer(b.getBrand());
		sb.appendCodePoint(65);//the value you pass that it refer to the unicode point
		System.out.println(sb);//expected result will be KTMA in this A got appended at the end
		LessonOne lessonOne= new LessonOne();
		lessonOne.bike=Bike.valueOf("rc");
		lessonOne.emplementSwitchForTheEnum();
		
		
		
	}
	
	public void emplementSwitchForTheEnum() {
		switch(bike) {
		case duke:System.out.println("duke");
		System.out.println(bike.getBrand()+"  "+ bike.getFeature());
		break;
		case rc:System.out.println("RC");
		break;
		default :System.out.println("demo of switch with the enum");
		break;
		}
	}
	

}

enum Cars{
//private String b;// compile time error as first line of the enum should be always constant
	swift,alto,sumo,nano,bently;
	private String v;//we can define variable in the enum,method and constructor
	public static void main(String args[]) {
		Cars c=Cars.alto;
		Cars car[]=Cars.values();
		for(Cars cr:car) {
			System.out.println(cr+" index "+ cr.ordinal());			
		}
		System.out.println(Cars.valueOf("nano"));//valueOf return the enum constant for the string 
		System.out.println(c);
	}
}
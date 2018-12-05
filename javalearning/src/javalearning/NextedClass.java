package javalearning;

public class NextedClass {
	
	private static String msg="nexted message";
	private String msga="abc";
	
	public static class InnerStaticClass{
		public void displayStaticClass() {
			System.out.println("inner static class");
			//System.out.println(msga);//non static variable cann't be use in the static class
		}
		
	}
	
	
	public class InnerNonStaticClass{
		public void displayNonStaticClass() {
			System.out.println("inner non static class");
			
			System.out.println(msga);
		}
	}

}

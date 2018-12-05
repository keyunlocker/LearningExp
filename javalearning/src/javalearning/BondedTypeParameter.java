package javalearning;

public class BondedTypeParameter{
	
	public static void main(String args[]) {
	}
}


class BondedType<T extends Car> {
	
	T obj;
	public BondedType(T obj) {
		this.obj=obj;
	}
	
	public void getTheModel() {
		this.obj.displayModel();
	}
	
}



class Car {
	public void displayModel() {
		System.out.println("i m just parent car");
	}
}


class Maruti extends Car {
	public void displayModel() {
		System.out.println("i m Maruti");
	}
}


class Honda extends Car{
	public void displayModel() {
		System.out.println("i m honda");
	}
}
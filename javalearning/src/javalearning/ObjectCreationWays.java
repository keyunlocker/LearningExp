package javalearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * In object creation way using clone and deserialtion way 
 * the object constructor is not called
 * 
 * 
 * @author key
 *
 */
public class ObjectCreationWays {
	
	public static void main(String args[]) {
		
		//using new keyword
		System.out.println("new keyword");
		PojoBeans usingNew=new PojoBeans();
		usingNew.printClassName();
		
		//using class name and newInstance method
		try {
			Class cl=Class.forName("javalearning.PojoBeans");
			PojoBeans usingClass=(PojoBeans) cl.newInstance();
			System.out.println("using class");
			usingClass.printClassName();
			
			//clone way
			PojoBeans po=(PojoBeans) usingClass.clone();
			System.out.println("using clone");
			po.printClassName();//during the clone method the object constructor is not called.
			
			po.setName("Animesh");
			
			//deserialization example
			FileOutputStream fileOutputStream= new FileOutputStream("file.txt");
			ObjectOutputStream oo= new ObjectOutputStream(fileOutputStream);
			oo.writeObject(po);
			oo.close();
			fileOutputStream.close();
			
			FileInputStream fileInputStream= new FileInputStream("file.txt");
			ObjectInputStream oi= new ObjectInputStream(fileInputStream);
			PojoBeans deserial=(PojoBeans) oi.readObject();
			System.out.println("using deserialize");
			deserial.printClassName();
			
			
			//constructor example
			Constructor<PojoBeans> consPojo= PojoBeans.class.getDeclaredConstructor();
			PojoBeans conObject= consPojo.newInstance();
			System.out.println("constructor way");
			conObject.printClassName();
			
			
			
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (InstantiationException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (SecurityException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
	}

}

package javalearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class Mislinious {
	
	
	public static void main(String args[]) {
		List<String> a= new ArrayList<>();
		String ab[]= {"asd","sdsd","sdsd"};
		int s='c';
		System.out.println('z'+'a'+"=="+s);
		
		long auto=9;
		//int as=auto;//upper to lower auto type conversion won't happen
		double ad=auto;//this is possible because it is happening from lower to upper.auto type conversion is possible from upper to lower
		
		outer:for(int i=0;i<10;i++) {
			System.out.println("i"+i);
			inner:for(int j=0;j<5;j++) {
				if(i==4) {
					System.out.println();
					continue outer;
				}
				if(j==4) {
					System.out.println();
					break inner;
				}
				System.out.print(j);
				
			}
		}
		
		Mislinious p=null;
		p.checkNull();//but not advisable
		//p.noNullAllowed();//this is going to throw null pointer
		
		Function<Integer,Function<Integer,Function<Integer,Integer>>> d=f->g->h->f*g*h;
		System.out.println(d.apply(1).apply(2).apply(2));
		
		//this is for the inner static class
		NextedClass.InnerStaticClass inner= new NextedClass.InnerStaticClass();
		inner.displayStaticClass();
		
		//this is for the non static class
		NextedClass.InnerNonStaticClass innerNon=new NextedClass().new InnerNonStaticClass();
		//NextedClass.InnerNonStaticClass innerNone=new NextedClass().new InnerStaticClass();//this is not possible 
		innerNon.displayNonStaticClass();
		
		//Static block and block start
		
		/*BlockOfCode.checkStaticBlock();
		System.out.println("static block J  "+ BlockOfCode.j);*/
		
		BlockOfCode sb1= new BlockOfCode();
		sb1.printClassDetails();
		
		BlockOfCode sb2= new BlockOfCode();
		sb2.printClassDetails();
		//static block and block end
		
		
		//binary Numeric promotions
		Object o1=true?new Integer(4):new Float(2.0);
		Object o2=true?new Integer(4):new Integer(2);
		
		System.out.println(o1);
		System.out.println(o2);
		
		System.out.println("Animesh".substring(1));
		Map<String,String>hashMap= new HashMap<>();
		hashMap.put("ani", "mri");
		
		List<String>de= new LinkedList<>() ;
		de.add("1");
		de.add("2");
		de.add("3");
		de.add("4");
		de.add("5");
		de.add("6");
		de.add("7");
		de.add("8");
		de.add("9");
		de.add("0");
		de.add("2");
		Set<String>ss= new HashSet<>(de);
		System.out.println(ss);
		
		Iterator<String> it=de.iterator();
		for(;it.hasNext();) {
			System.out.println(it.next());
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(de);
		Collections.reverse(de);
		System.out.println(de);
		
		Integer i= new Integer(7);
		System.out.println(i+""+i.hashCode());
		modifiyInteger(i);
		System.out.println(i);
	}
	
	
	private static void modifiyInteger(Integer i) {
		i=i*2;
		System.out.println(i+""+i.hashCode());
		
	}


	public static void checkNull() {
		System.out.println("i am called with null refernce");
	}
	
	public void noNullAllowed() {
		System.out.println("i can't be called from null");
	}

}

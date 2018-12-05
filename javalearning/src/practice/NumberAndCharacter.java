package practice;

import java.util.Scanner;

public class NumberAndCharacter {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		char ar[]= new char[5];
		for(int i=0;i<5;i++) {
			ar[i]=sc.next().charAt(0);
		}
		
		for(char c:ar) {
			if(c>=48 && c<=57) {
				System.out.print(c);
			}
		}
		
	}

}

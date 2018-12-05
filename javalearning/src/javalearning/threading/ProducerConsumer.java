package javalearning.threading;

import java.util.Scanner;

public class ProducerConsumer {
	int number;
	boolean flag=false;
	public void producer() throws InterruptedException {
		Scanner sc= new Scanner(System.in);
		synchronized(this) {
			if(flag)
				wait();
			System.out.println("Please enter the number for producer");
			this.number=sc.nextInt();
			flag=true;
			notify();
		}
	}
	
	public void consumer() throws InterruptedException {
		synchronized(this) {
			if(!flag)
				wait();
			System.out.println("consumer consumed"+this.number);
			flag=false;
			notify();
		}
	}

}

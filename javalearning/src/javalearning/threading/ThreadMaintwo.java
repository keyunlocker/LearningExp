package javalearning.threading;

public class ThreadMaintwo {
	public static Thread t1;
	public static Thread t2;
	public static void main(String[] args) throws InterruptedException {
		t1= new Thread(()->{
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName()+"---->"+i+"----t2 status-----"+t2.getState());
				
			}
		}) ;
		t2= new Thread(()->{
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName()+"---->"+i+"-----t1 status-----"+t1.getState());
			}
		}) ;
		t1.setName("T1");
		t2.setName("T2");
		t1.setPriority(7);
		t2.setPriority(1);
		//Thread.currentThread().setPriority(10);
		t1.start();
		t2.start();
		t1.join();
		System.out.println("after t1 join");
		t2.join();
		System.out.println("after t2 join");
		
	}
}

package javalearning.threading;

public class ThreadMainOne {

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer producerConsumer= new ProducerConsumer();
		Thread t1= new Thread(() -> {
			try {
				int i=0;
				while(i<4) {
					producerConsumer.producer();
					i++;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread t2= new Thread(() -> {
			try {
				int i=0;
				while(i<4) {
					producerConsumer.consumer();
					i++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
		/*t1.join();
		t2.join();*/
	}
}

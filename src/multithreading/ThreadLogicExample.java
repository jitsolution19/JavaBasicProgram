package multithreading;

public class ThreadLogicExample extends Thread {
	int value = 10;

	public void run() {
		value = value + 1;

		System.out.println("Thread :: "+Thread.currentThread().getId());
		System.out.println(value);

	}

	public static void main(String[] args) {

		Thread th1 = new ThreadLogicExample();
		Thread th2 = new ThreadLogicExample();
//		th1.start();
		th2.start();
		
//		System.out.println(th1.currentThread().getId());
//		System.out.println(th2.currentThread().getId());

	}

}

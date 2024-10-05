package week4;

//multitasking->different apps
//multithreading->same apps different work

//Theading life cycles
//New -> born
//Runnable -> ready to run
//Running -> running
//Timed wait -> waiting time to start
//Blocked -> block 1 process to complete other process
//Terminated -> completed all process and terminated

public class Threa extends Thread{
	static int k=0;
	
	@Override
	public void run() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i+""+Thread.currentThread());
			}
		}
		System.out.println(Thread.currentThread());
		k++;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Threa t=new Threa();
		t.setName("new Thread");
		t.start();
		Threa t1=new Threa();
		t1.setName("new Thread 1");
		t1.start();
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i+""+Thread.currentThread());
//		}
		
		//main thread inbuilt in java don"t need to create
		//main thread always have the first priority 
		t.join(); 	//join used to start the created thread first instead of main thread
		t1.join();
		//using while (isAlive) we can see how many time thread as been runned
//		while(t.isAlive()) {
//			System.out.println("alive");
//		}
		System.out.println("eeee");
		System.out.println(Thread.currentThread());
		System.out.println(k);
		k++;
		System.out.println(k);
	}

}

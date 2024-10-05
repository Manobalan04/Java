package week4;

class Message1{
	public void SendMsg(String msg) throws InterruptedException{
		System.out.println("message sent");
		Thread.sleep(2000);
		System.out.println("message received"+msg);
	}
}
public class Sender123 extends Thread{

	Message1 msg1;
	String msg;
	
	public Sender123(Message1 msg1,String msg){
		this.msg1=msg1;
		this.msg=msg;
	}
	
	public void run() {
		try {
			synchronized (msg1) {	//synchronized block
				this.msg1.SendMsg(msg);
			}
//			this.msg1.SendMsg(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message1 m=new Message1();
		Sender123 s1=new Sender123(m," hello");
		Sender123 s2=new Sender123(m," hello 2");
		s1.start();
		s2.start();
	}

}

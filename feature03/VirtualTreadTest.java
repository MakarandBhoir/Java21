package feature03;

public class VirtualTreadTest {

	public static void main(String[] args) {
		//Thread.ofPlatform().start(new HelloRunnable());
		
		Thread virtualThread = Thread.ofVirtual().start(new HelloRunnable());
//		virtualThread.setDaemon(false);
		
		try {
			virtualThread.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

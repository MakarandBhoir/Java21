package feature03;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
public class ThreadComparison {
	
	private static final int NUM_THREADS = 1000000;
	
	public static void main(String[] args) {
		System.out.println("Comparing Virtual Threads and Platform Threads");
		Instant start = Instant.now();		
		
		createVirtualThread();
		
		Instant end = Instant.now();
		long timeElapsed = Duration.between(start, end).toMillis();
		System.out.println("Virtual Thread: " + timeElapsed + " miliseconds");
		
		System.out.println("----------------------------------------------");
		
		
		Instant start2 = Instant.now();		
		
		createPlatformThread();
		
		Instant end2 = Instant.now();
		long timeElapsed2 = Duration.between(start2, end2).toMillis();
		System.out.println("Platform Thread: " + timeElapsed2 + " miliseconds");
		
		System.out.println("Virtual Thread are " + timeElapsed2/(double)timeElapsed + " times faster than Platform Thread");
	}
	private static void createVirtualThread() {
		List<Thread> threads = new ArrayList<Thread>();
		
		for(int i=0; i<NUM_THREADS; i++) {
			Thread virtualThread = Thread.ofVirtual().start(()->{
				try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
			});
			threads.add(virtualThread);
		}
		waitForThreadsToFinish(threads);
	}
	
	private static void createPlatformThread() {
		List<Thread> threads = new ArrayList<Thread>();
		
		Runnable runnablePlatform = () -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        
		for(int i = 0; i < NUM_THREADS; i++) {
            Thread thread = new Thread(runnablePlatform);
            thread.start();
            threads.add(thread);
		}
		waitForThreadsToFinish(threads);
	      
	}

	private static void waitForThreadsToFinish(List<Thread> threads) {
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package scheduler;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Date;

class SchedulerThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+"Exceution start at :"+ new Date());
		try {
			Thread.sleep(1000);  //After delay of 1 second next line is executed
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"Exceution end at :"+ new Date());
		
		
		
	}
	
	
	

}

public class SchedulerProg {
	
	public static void main(String[] args) throws InterruptedException {
		

		ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
		
		//Scheduling after 5 second delay
		
		System.out.println("Current Time Before Excuting.."+ new Date());
		
		for(int i=0;i<=5;i++)
		{
			
			SchedulerThread worker_thread= new SchedulerThread();
			pool.schedule(worker_thread,50 , TimeUnit.MILLISECONDS);
		}
		
		Thread.sleep(10000);
		pool.shutdown();
		while(!pool.isTerminated())
		{
			
		}
		System.out.println("Finished");
		
		
		
	}
	
	

}

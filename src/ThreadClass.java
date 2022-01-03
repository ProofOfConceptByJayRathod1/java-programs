

public class ThreadClass  {
	
    private class RunnableImpl extends Thread  {
    	@Override  
    	public void run()
    	{
    		try {
    			// Displaying the thread that is running
    			System.out.println(
    				"Thread ID:" + Thread.currentThread().getId() +",Thread name:"+Thread.currentThread().getName()
    				+ " is running");
    		}
    		catch (Exception e) {
    			// Throwing an exception
    			System.out.println("Exception is caught while performing multithreading");
    		}
    	}
    }
	
public static void main(String[] args) {

int n = 10; // Number of threads
for (int i = 0; i < n; i++) {
	RunnableImpl object
		= new ThreadClass().new RunnableImpl();
	object.start();
}

}

}
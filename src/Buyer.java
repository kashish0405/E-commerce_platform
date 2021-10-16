import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Buyer<V> extends BuyerBase<V> {
			int catalogSize;
    public Buyer (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, int iteration) {
        //TODO Complete the Buyer Constructor method
        // ...
    	setSleepTime(sleepTime);
    	this.catalog=catalog;
    	this.lock=lock;
    	this.full=full;
    	this.empty=empty;
    	setIteration(iteration); 
    	this.catalogSize=catalogSize;
    	
    }
    public void buy() throws InterruptedException {
    	lock.lock();
	try {
            //TODO Complete the try block for consume method
            // ...
		while(catalog.isEmpty()) {
			empty.await();
		}
		NodeBase<V> n=catalog.removeMin();
		
		
	    System.out.print("Consumed "); // DO NOT REMOVE (For Automated Testing)
            n.show(); // DO NOT REMOVE (For Automated Testing)
            
            full.signalAll();
            
            // ...
	} catch (Exception e) {
            e.printStackTrace();
	} finally {
            //TODO Complete this block
		lock.unlock();
	}
    }
}

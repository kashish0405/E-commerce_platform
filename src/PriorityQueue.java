
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity, currentSize;
	
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) {  
    	this.capacity=capacity;
    	 currentSize=0;
    	queue = new NodeBase[capacity];
    }
    
   
    public int size() {
    	
    	return this.currentSize;
    	}

    public boolean isEmpty() {
    	if(size()==0) {
    		return true;
    	}
    	else
    		return false;

    }
	
    public boolean isFull() {
    	if (size()==capacity) {
    		return true;
    		
    	}
    	else 
    		return false;
    
    }

    public void enqueue(Node<V> node) {
    	if(isFull())
    		
    		return;
    	else 
    		{queue[currentSize++]=node;
    		
    		}
    	
    	
    
    }
    public void add(int priority, V value) {
    	
    	
    	enqueue(new Node<V>(priority,value));
    	
    	
    }

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {
    	
    	NodeBase del=null;
    	if(isEmpty())
    	{
    		System.out.println("Underflow");
    	}
    	
    	else 
    		{
    		int index=0;
    		del = queue[0];
    		int i;
    	    for ( i = 1; i < currentSize; i++) 
    	         {if(queue[i].getPriority()<del.getPriority())
    	         { del=queue[i];
    	           index=i;
    	         }
    	         }
    	     queue[index]=queue[currentSize-1];  
    	     this.currentSize--;
    		}
    	
    	return del;
    		

    }

    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i+1].show();              
	}
    }

	public NodeBase<V> removeMin() {
		
		return dequeue();
		
	}
}




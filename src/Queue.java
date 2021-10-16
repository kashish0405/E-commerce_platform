// This class implements the Queue
public class Queue<V> implements QueueInterface<V> {
	private NodeBase<V>[] queue;
    private int capacity, currentSize,front,rear;
	
    //TODO Complete the Queue implementation
    public Queue(int capacity) {  
    	this.capacity=capacity;
    	front=rear=-1;
    	currentSize=0;
    	queue = new NodeBase[capacity];
    }
    
    
    public int size() {
    	
    	return this.currentSize;
    	}

    public boolean isEmpty() {
    	if(front==-1 && rear==-1) {
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
    	{	System.out.println("overflow");
    		return;}
    	else if(isEmpty())
    		{
    		front=rear=0;
    		queue[rear]= node;
        	this.currentSize++;
    		}
    	else if(rear == capacity -1 && front != 0)   
        {  
            rear = 0;
            queue[rear]= node;
        	this.currentSize++;
        }  
    	else {
    		rear=(rear+1)%capacity;
    		queue[rear]= node;
        	this.currentSize++;
    		
    	}
    
    }
    
    public NodeBase<V> dequeue() {
    	
    	NodeBase<V> del=null;
    	if(isEmpty())
    	{
    		System.out.println("Underflow");
    	}
    	else if(front==rear)     //if only one element in the array
    		{del=queue[front];
    		front=rear=-1; 
    		this.currentSize--;
    		
    		}
    	
    	else 
    		{del=queue[front];
    		queue[front]=null;
    		front=(front+1)%capacity;
    		this.currentSize--;
    	   
    		}
    	
    	return del;
    		

    }
}

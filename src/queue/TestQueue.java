package queue;

public class TestQueue {

	public static void main(String[] args) {

       
		ArrayQueue queue = new ArrayQueue(5);
		
		
		queue.queueDequeue();
		queue.queueEnqueue(1);
		queue.queueEnqueue(2);
		queue.queueEnqueue(3);
		queue.queueEnqueue(4);
		queue.queueEnqueue(5);
	 // Adding more elements should result in "Queue ist voll."
	//ArrayQueue.queueEnqueue(6);
		ArrayQueue.queueDisplay();
		
		System.out.println(queue.queueDequeue());
		System.out.println(queue.queueDequeue());
		System.out.println(queue.queueDequeue());
		
		ArrayQueue.queueDisplay();
		
		
		System.out.println("the first element is: " + ArrayQueue.queueFront());
		
 
    
	}

}

package queue;

public class TestQueue {

	public static void main(String[] args) {

       
		ArrayQueue queue = new ArrayQueue(5);
		
		
		ArrayQueue.queueDequeue();
		ArrayQueue.queueEnqueue(1);
		ArrayQueue.queueEnqueue(2);
		ArrayQueue.queueEnqueue(3);
		ArrayQueue.queueEnqueue(4);
		ArrayQueue.queueEnqueue(5);
	 // Adding more elements should result in "Queue ist voll."
	//ArrayQueue.queueEnqueue(6);
		ArrayQueue.queueDisplay();
		
		System.out.println(ArrayQueue.queueDequeue());
		System.out.println(ArrayQueue.queueDequeue());
		System.out.println(ArrayQueue.queueDequeue());
		
		ArrayQueue.queueDisplay();
		
		
		System.out.println("the first element is: " + ArrayQueue.queueFront());
		
 
    
	}

}

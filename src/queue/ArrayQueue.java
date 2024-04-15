package queue;

public class ArrayQueue {
	
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/**
	 * method for adding numbers to queue
	 * @param item
	 */
	public void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		} else {
			queue[rear] = item;
			rear++;
		}
	}
	
	/**
	 * method for deleting numbers from queue
	 * @return
	 */
	public int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			firstElement = queue[front];
			for(int i = 0; i < (rear-1); i++) {
				queue[i] = queue[i+1];
		}
			if(rear < capacity) {
			queue[rear]=0;
		}
			rear--;
		
		}
		return firstElement;
	}
	
	/**
	 * prints out elements of queue
	 */
	public static void queueDisplay() {
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * shows first element of queue
	 * @return
	 */
	public static int queueFront() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			firstElement = queue[front];
		}
		return firstElement;
	}

}

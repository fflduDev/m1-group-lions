package queue;

public class QueueImpl implements Queue {
	int numRiders = 6;
	String[] arr = new String[numRiders]; //creates array of 6 riders based on project specifications
	int queueSize = 0;

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (arr[numRiders -1] != null){
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(arr[0] == null){
			return true;
		}
		return false;
	}

	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println(element + " cannot join the queue because it is full");
		}
		else{
			arr[queueSize] = element;
			System.out.println(element + " has successfully joined the back of the queue");
			queueSize++;
		}
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		else{
			System.out.println("The element, " + arr[0] + ", has successfully been removed from the front of the queue");
			for (int i = 0; i < numRiders-1; i++) {
				arr[i] = arr[i + 1];

			}
			arr[numRiders-1] = null;
			queueSize--;
			return arr[0];
		}
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (int i = 0; i < numRiders; i++) {
			System.out.println("The element in position " + i + " is " + arr[i]);
		}
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		else{
			System.out.println("The element in the front of the queue is " + arr[0]);
			return arr[0];
		}
		return null;
	}

}

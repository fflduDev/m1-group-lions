package stack;

class StackNode {
	String data;
	StackNode next;

	public StackNode(String data) {
		this.data = data;
		this.next = null;
	}
}

public class StackImpl implements Stack {
	private StackNode top;  // Top of the stack
	private int size;       // Stack size
	private int capacity;   // Maximum allowed capacity

	public StackImpl() {
		this.top = null;
		this.size = 0;
		this.capacity = Integer.MAX_VALUE; // Default to no limit
	}

	@Override
	public void push(String s) {
		if (isFull()) {
			System.out.println("Stack is full! Cannot push: " + s);
			return;
		}
		StackNode newNode = new StackNode(s);
		newNode.next = top; // New node points to the old top
		top = newNode; // Update top to new node
		size++;
		System.out.println("Pushed: " + s);
	}

	@Override
	public String pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty! Cannot pop.");
			return null;
		}
		String poppedData = top.data;
		top = top.next; // Move top down
		size--;
		return poppedData;
	}

	@Override
	public Boolean isEmpty() {
		return top == null;
	}

	@Override
	public Boolean isFull() {
		return size >= capacity; // Stack is full if size hits capacity
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty! No top element.");
			return null;
		}
		return top.data;
	}

	@Override
	public void setCapacity(int size) {
		this.capacity = size;
	}

	@Override
	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return;
		}
		StackNode current = top;
		System.out.print("Stack (Top -> Bottom): ");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("NULL");
	}
}
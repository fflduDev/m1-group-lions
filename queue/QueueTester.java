package queue;

public class QueueTester {

public static void runTests (Queue q) {

	q.deQueue();
	q.peek();
	q.enQueue("Sam");
	q.enQueue("Bill");
	q.enQueue("Todd");
	q.display();
	q.peek();
	q.deQueue();
	q.display();
	q.enQueue("Reynold");
	q.enQueue("Lucy");
	q.enQueue("Ryan");
	q.enQueue("Jimmy");
	q.enQueue("Pam");
	q.peek();
	q.deQueue();
	q.display();

}
	public static void main(String[] args) {
		Queue theQueue = new QueueImpl();
		runTests(theQueue);
	}

}

package queue;

public class QueueTester {

public static void runTests (Queue q) {

	q.enQueue("Sally");
	q.enQueue("Bob");
	q.enQueue("Kevin");
	q.enQueue("Bill");
	q.enQueue("Marsha");
	q.enQueue("Tom");
	q.display();
	q.peek();
	q.deQueue();
	q.display();
	q.enQueue("Pat");
	q.enQueue("Lily");
	q.peek();
	q.deQueue();
	q.display();

}
	public static void main(String[] args) {
		Queue theQueue = new QueueImpl();
		runTests(theQueue);
	}

}

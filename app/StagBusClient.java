package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import linkedList.LinkedListTester;
import queue.Queue;
import queue.QueueImpl;
import queue.QueueTester;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then

		System.out.println("-----L I S T  T E S T------");

		System.out.println();
		LinkedList list = new LinkedListImpl();
		//listRunTestMethod...
 		list.addItem("Campus Circle");
		 list.addItem("Train Station");
		 list.addItem("Stop N Shop");
		 list.addItem("Beach");
		 list.listItems();
		 System.out.println("Is Train Station in the list: " + list.isItemInList("Train Station"));
		System.out.println("Is Chipotle in the list: " + list.isItemInList("Chipotle"));
		list.deleteItem("Beach");
		System.out.print("Removing Beach: ");
		list.listItems();
		list.insertBefore("McDonalds", "Stop N Shop");
		System.out.print("Inserting McDonalds before Stop N Shop: ");
		list.listItems();
		list.insertAfter("CVS", "Train Station");
		System.out.print("Inserting CVS after Train Station: ");
		list.listItems();
		System.out.println();

		System.out.println("-----S T A C K  T E S T------");

		//StackRunTestMethod...


		System.out.println("----Q U E U E  T E S T-------");

		System.out.println();
		Queue queue = new QueueImpl();
		//QRunTestMethod...
		queue.enQueue("Sally");
		queue.enQueue("Bob");
		queue.enQueue("Kevin");
		queue.enQueue("Bill");
		queue.enQueue("Marsha");
		queue.enQueue("Tom");
		queue.display();
		queue.peek();
		queue.deQueue();
		queue.display();
		queue.enQueue("Pat");
		queue.enQueue("Lily");
		queue.peek();
		queue.deQueue();
		queue.display();


	 	}

}

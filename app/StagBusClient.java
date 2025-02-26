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
		//listRunTestMethod...
		listRunTestMethod();
		System.out.println();

		System.out.println("----Q U E U E  T E S T-------");
		//QRunTestMethod...
		queueRunTestMethod();
		System.out.println();

		System.out.println("-----S T A C K  T E S T------");
		//StackRunTestMethod...
		stackRunTestMethod();

		System.out.println("-----C O M P L E T E------");


	}
		//LINKED_LIST METHOD
		private static void listRunTestMethod(){
			LinkedList list = new LinkedListImpl();
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
		}
		// QUEUE METHOD
		private static void queueRunTestMethod() {
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
		// STACK METHOD
		private static void stackRunTestMethod () {
			Stack boardingStack = new StackImpl();

			// Create (push) 6 riders
			boardingStack.push("Alice");
			boardingStack.push("Bob");
			boardingStack.push("Charlie");
			boardingStack.push("Diana");
			boardingStack.push("Ethan");
			boardingStack.push("Frank");

			// Display stack
			System.out.println("Initial Stack (Riders Boarding):");
			boardingStack.display();

			// Peek at the stack
			System.out.println("\nPeek at top of stack: " + boardingStack.peek());

			// Remove (pop) the top of the stack
			System.out.println("\nPop top rider: " + boardingStack.pop());
			boardingStack.display();

			// Peek again
			System.out.println("\nPeek at top of stack: " + boardingStack.peek());

			// Add two more riders
			System.out.println("\nAdding new riders: 'George' and 'Hannah'");
			boardingStack.push("George");
			boardingStack.push("Hannah");
			boardingStack.display();

			// Peek again
			System.out.println("\nPeek at top of stack: " + boardingStack.peek());

			// Remove all riders
			System.out.println("\nPopping all riders...");
			while (!boardingStack.isEmpty()) {
				System.out.println("Popped: " + boardingStack.pop());
			}

			// Verify stack is empty
			System.out.println("\nIs stack empty? " + boardingStack.isEmpty());

		}


}

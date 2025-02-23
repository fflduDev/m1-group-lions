package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		test();

	}

	public static void test() {
		LinkedList tester = new LinkedListImpl();
		tester.addItem("dog");
		tester.addItem("cat");
		tester.addItem("mouse");
		tester.addItem("tiger");
		tester.listItems();
		System.out.println("Number of items in list: " + tester.itemCount());
		System.out.println("Is dog in list: " + tester.isItemInList("dog"));
		System.out.println("Is rabbit in list: " + tester.isItemInList("rabbit"));
		System.out.println("Dog removed: " + tester.deleteItem("dog"));
		tester.listItems();
		System.out.println("lion inserted before cat: " + tester.insertBefore("lion", "cat"));
		tester.listItems();
		System.out.println("fish inserted after mouse: " + tester.insertAfter("fish", "mouse"));
		tester.listItems();
		tester.sort();
		System.out.print("Sorted list: ");
		tester.listItems();
	}
}

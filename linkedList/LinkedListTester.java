package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("an item to add");
		tester.addItem("num 2");
		tester.addItem("num 3");

		System.out.println(tester.itemCount());
		tester.listItems();
		System.out.println(tester.isItemInList("numhjh 2"));
		tester.deleteItem("num 2");
		tester.listItems();
		//cool comment

	}

}

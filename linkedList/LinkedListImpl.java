package linkedList;

public class LinkedListImpl implements LinkedList {

	ListItem head;
	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub

		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		
		if (head == null) {
			head = new ListItem(thisItem);
			return true;
		}
		else {
			ListItem current = head;

			while (current != null) {
				if (current.data.equals(thisItem)) {
					return false;
				}
				current = current.next;
			}

			current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListItem(thisItem);
			return true;
		}
	

	}

	@Override
	public Integer itemCount() {

		ListItem current = head;
		Integer count = 0;

		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	@Override
	public void listItems() {
		// TODO Auto-generated method stub

		ListItem current = head;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.data);
			current = current.next;
			if (current != null) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {

		if (head == null) {
			return false;
		}
		else if (head.data.equals(thisItem)) {
			head = head.next;
			return true;
		}
		else {
			ListItem current = head;
			while (current.next != null) {
				if (current.next.data.equals(thisItem)) {
					current.next = current.next.next;
					return true;
				}
				else {
					current = current.next;
				}
			}
		}

		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		ListItem current = head;

		while (current != null && current.next != null) {
			if (current.data.equals(itemToInsertBefore)) {
				ListItem newNode = new ListItem(newItem);
				newNode.next = head;
				head = newNode;
				return true;
			}
			else if (current.next.data.equals(itemToInsertBefore)) {

				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}

		return false;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		ListItem current = head;


		while (current != null) {
			if (current.data.equals(itemToInsertAfter)) {

				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}

		return false;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		if (head == null || head.next == null) {
			return;
		}

		boolean swapped = true;

		while (swapped) {
			swapped = false;
			ListItem current = head;


			while (current != null && current.next != null) {
				if (current.data.compareTo(current.next.data) > 0) {

					String temp = current.data;
					current.data = current.next.data;
					current.next.data = temp;
					swapped = true;
				}
				current = current.next;
			}
		}
	}
	
}

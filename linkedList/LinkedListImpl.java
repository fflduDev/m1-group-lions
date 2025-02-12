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

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {

		if (head == null) {
			return false;
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
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}

package stack;

public class StackTester {
	public static void main(String[] args) {
		Stack stack = new StackImpl();

		System.out.println("Pushing elements onto the stack:");
		stack.push("Alice");
		stack.push("Bob");
		stack.push("Charlie");
		stack.push("Dave");
		stack.display();

		System.out.println("\nPeek at the top: " + stack.peek());

		System.out.println("\nPopping elements:");
		System.out.println("Popped: " + stack.pop());
		stack.display();

		System.out.println("\nPopping another:");
		System.out.println("Popped: " + stack.pop());
		stack.display();

		System.out.println("\nFinal peek: " + stack.peek());
	}
}
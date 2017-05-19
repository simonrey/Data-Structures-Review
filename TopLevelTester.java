


public class TopLevelTester{
	public static void main(String[] args) {

		myStack stack = new myStack();

		stack.push("First",111);
		stack.push("Second",222);

		System.out.println("First item on the stack: " + stack.pop().getName() + stack.isEmpty());

		System.out.println("Next item on the stack: " + stack.pop().getName() + stack.isEmpty());




		// System.out.println("WTF");
	}
}


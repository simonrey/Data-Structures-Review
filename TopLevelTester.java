


public class TopLevelTester{
	public static void main(String[] args) {



		// StackImplementation();

		LinkedListImplementation();



		// System.out.println("WTF");
	}


	private static void StackImplementation(){
		myStack stack = new myStack();
	

		stack.push("First",111);
		stack.push("Second",222);

		System.out.println("First item on the stack: " + stack.pop().getName() + stack.isEmpty());

		System.out.println("Next item on the stack: " + stack.pop().getName() + stack.isEmpty());

	}

	private static void LinkedListImplementation(){

		myLinkedList ll = new myLinkedList();

		Node n1 = new Node("A",100);
		Node n2 = new Node("B",200);
		Node n3 = new Node("C",300);

		ll.addNode(n1);
		ll.addNode(n3);
		ll.addNode(n2);

		

		System.out.println("Looking for the element with name 'C': " + ll.findNode("C",ll.getHead()).getData() + "\n");

		// System.out.println("Looking for the element with name 'D': " + ll.findNode("D",ll.getHead()).getData() + "\n");

		System.out.println("Looking for the element with name 'A': " + ll.findNode("A",ll.getHead()).getData() + "\n");


	}

}


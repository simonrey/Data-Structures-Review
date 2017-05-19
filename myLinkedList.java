public class myLinkedList{
	Node head, tail;
	int size;


	public myLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}

	public Node getHead(){
		return head;
	}

	public Node getTail(){
		return tail;
	}

	public void addNode(Node newNode){
		if(this.head == null && this.tail == null){
			this.head = newNode;
			this.tail = newNode;
			newNode.setNext(null);
			newNode.setPrevious(null);
		}
		else{
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
		}
	}

	public Node removeNode(String name, Node theNode){
		if(name == theNode.getName()){
			theNode.getPreviousNode().setNext(head.getNextNode());
			theNode.getNextNode().setPrevious(head.getPreviousNode());
			return head;
		}
		if(theNode == null){
			return null;
		}
		else{
			return removeNode(name, head.getNextNode());
		}
	}


}
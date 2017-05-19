
public class myStack{

	private Node top;
	private int size;

	public myStack(){
		this.top = null;
		this.size = 0;
	}

	public Node pop(){
		Node tempNode = top;
		this.top = top.getPreviousNode();
		size --;
		return tempNode;
	}

	public void push(String name, int data){
		Node newNode = new Node(name, data, top);
		this.top = newNode;
		size ++;
	}

	public boolean isEmpty(){
		return (size>0) ? false : true;
	}


}




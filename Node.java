public class Node{
	private String name;
	private int data;
	private Node prvNode;
	private Node nextNode;

	public Node(String name, int data, Node prvTop){
		this.name = name;
		this.data = data;
		this.prvNode = prvTop;
	}

	public Node(String name, int data, Node prvNode, Node nextNode){
		this.name = name;
		this.data = data;
		this.prvNode = prvNode;
		this.nextNode = nextNode;
	}

	public String getName(){
		return this.name;
	}

	public int getData(){
		return this.data;
	}

	public Node getPreviousNode(){
		return this.prvNode;
	}

	public Node getNextNode(){
		return this.nextNode;
	}

	public void setNext(Node nextNode){
		this.nextNode = nextNode;
	}

	public void setPrevious(Node prvNode){
		this.prvNode = prvNode;
	}
}
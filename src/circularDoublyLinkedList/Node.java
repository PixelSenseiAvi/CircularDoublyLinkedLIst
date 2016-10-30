package circularDoublyLinkedList;

public class Node {

	public Node next;
	public Node previous;
	public int data;
	
	public Node(int data){
		this.data=data;
		next=null;
		previous=null;
	}
	
	public Node (Node previous,int data, Node next){
		this.next=next;
		this.previous=previous;
		this.data= data;
	}
	
	public int Data(){
		return data;
	}

}

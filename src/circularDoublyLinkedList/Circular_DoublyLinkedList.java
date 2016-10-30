package circularDoublyLinkedList;

public class Circular_DoublyLinkedList {

	private Node head;
	private int size;
	
	public Circular_DoublyLinkedList(){
		head=null;
		size=0;
	}
	
	public void addBefore(int before,int data){
		Node newNode = null;
		if(head==null){	
			System.out.println("List is Empty. Adding the first Node");
			newNode= new Node(data);
			head=newNode;	
			newNode.next=head;
			size++;
			return;
		}
		else{
			Node current = head;
			while(current.data!=before){
				current=current.next;
				if(current==head){
					System.out.println("Given data cannot be found returning from this method");
					return;
				}
			}
			newNode= new Node(current.previous,data,current);
			if(current.previous!=null){
				current.previous.next=newNode;
			}
			current.previous=newNode;
			size++;
		}
	}
	
	public void addAfter(int after,int data){
		Node newNode = null;
		if(head==null){	
			System.out.println("List is Empty. Adding the first Node");
			newNode= new Node(data);
			head=newNode;	
			newNode.next=head;
			size++;
			return;
		}
		else{
			Node current = head;
			while(current.data!=after){
				current=current.next;
				if(current==head){
					System.out.println("Given data cannot be found returning from this method");
					return;
				}
			}
			newNode= new Node(current,data,current.next);
			current.next.previous=newNode;
			current.next=newNode;
			size++;
		}
	}
	
	//we will use this method only if our LinkedList contains only distinct data
	public void deleteData(int data){
		if(head==null){	
			System.out.println("List is Empty. Returning");
			return;
		}
		else{
			Node current = head;
			while(current.data!=data){
				current=current.next;
				if(current==head){
					System.out.println("Given data cannot be found returning from this method");
					return;
				}
			}
			current.previous.next=current.next;
			current.next.previous=current.previous;
			size--;
		}
	}
	
	public void deleteNodeBefore(int data){
		if(head==null){	
			System.out.println("List is Empty. Returning");
			return;
		}
		else{
			Node current = head;
			while(current.data!=data){
				current=current.next;
				if(current==head){
					System.out.println("Given data cannot be found returning from this method");
					return;
				}
			}
			current=current.previous;
			current.previous.next=current.next;
			current.next.previous=current.previous;
			size--;
		}
	}
	
	public void deleteNodeAfter(int data){
		if(head==null){	
			System.out.println("List is Empty. Returning");
			return;
		}
		else{
			Node current = head;
			while(current.data!=data){
				current=current.next;
				if(current==head){
					System.out.println("Given data cannot be found returning from this method");
					return;
				}
			}
			/*if(current.next==head){
				head=current=current.next;
				current.previous.next=current.next;
				current.next.previous=current.previous;
				size--;
				return;
			}*/
			current=current.next;
			current.previous.next=current.next;
			current.next.previous=current.previous;
			size--;
		}
	}
	
	public void displayList(){
		if(size==0){
			System.out.println("LinkedList is empty");
			return;
		}
		Node current=head;
		if(size==1){
			System.out.println(current.data);
			return;
		}
		do{
			System.out.println(current.data);
			current=current.next;
		}while(current!=head);
	}
	
	public int getSize(){
		return size;
	}
}

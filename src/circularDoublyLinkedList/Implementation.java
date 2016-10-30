package circularDoublyLinkedList;

import java.util.Scanner;

public class Implementation {
	public static void main(String args[]){
		Circular_DoublyLinkedList cdl= new Circular_DoublyLinkedList();	
		Scanner scan=new Scanner(System.in);
		int data=0,after=0,before=0;
		boolean out = false;
		while(out!=true){
			System.out.println("Press\n 1.AddBefore\t2.AddAfter\t3.DeleteData\t4.DeleteBefore\t5.DeleteAfter\t6.DisplayNodes\t7.DisplaySize\t8.Exit\n");
			int option = scan.nextInt();
		switch(option){
		case 1:
			System.out.println("Enter the data BEFORE which you want to add");
			before=scan.nextInt();
			System.out.println("Enter the data which you want to add");
			data=scan.nextInt();
			cdl.addBefore(before, data);
			break;
			
		case 2:
			System.out.println("Enter the data After which you want to add");
			after=scan.nextInt();
			System.out.println("Enter the data which you want to add");
			data=scan.nextInt();
			cdl.addAfter(after, data);
			break;
			
		case 3:
			System.out.println("Enter the data which you want to delete");
			data=scan.nextInt();
			cdl.deleteData(data);
			break;
			
		case 4:
			System.out.println("Enter the data Before which you want to delete node");
			before=scan.nextInt();
			cdl.deleteNodeBefore(before);
			break;
			
		case 5:
			System.out.println("Enter the data Before which you want to delete node");
			after=scan.nextInt();
			cdl.deleteNodeAfter(after);
			break;
			
		case 6:
			cdl.displayList();
			break;
			
		case 7:
			System.out.println(cdl.getSize());
			break;
			
		case 8:
			out=true;
			break;
			
		default:
			System.out.println("Invalid option");
			break;
		}
		}
		scan.close();
	}
}

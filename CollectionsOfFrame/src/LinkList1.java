import java.io.*;
import java.util.*;

public class LinkList1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> a=new LinkedList<>();
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the element in list");
		for(int i=0;i<size;i++) {
			a.add(sc.nextInt());
		}
			
		int choice=0;
		int position;
		int element;
		while(choice<4){
			System.out.print("1)Add element\n 2)Remove an Element\n 3)Change an Element\n 4)Clear the list\n 5)Display\n 6)Exit\n");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice){
				case(1):System.out.println("Enter the data");
						element=sc.nextInt();
						System.out.println("Enter the position");
						position=sc.nextInt();
						a.add(position-1, element);
						break;
				case(2):System.out.println("Enter the position");
						position=sc.nextInt();
						a.remove(position);
						break;
				case(3):System.out.println("Enter the position");
						position=sc.nextInt();
						System.out.println("Enter the element to add");
						element=sc.nextInt();
						a.set(position-1, element);
				case(4):System.out.println("Clear all list");
						a.clear();
						break;
				case(5):System.out.println("List are");
						Iterator i=a.iterator();
						while(i.hasNext()) {
							System.out.println(i.next()+ " ");
						}
						break;
				case(6):System.out.println("Exit\n");
						break;
			}			
		}
	}
}

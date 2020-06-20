import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>();
		
		ar.add(20);
		ar.add(23);
		ar.add(45);
		ar.add(60);
		ar.add(98);
		ar.add(43);
		
		System.out.print(ar.toString());
		
		System.out.println();
		
		Iterator i=ar.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		// TODO Auto-generated method  stub

	}

}

import java.io.*;
import java.util.*;
public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		int ar[]= {11,12,13,14,15};
		
		for(int i=0;i<ar.length;i++) {
			v.add(ar[i]);
		}
		
		System.out.println("Vector Element");
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		Iterator it=v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}

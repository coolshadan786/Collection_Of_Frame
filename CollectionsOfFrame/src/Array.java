import java.io.*;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("Bihar");
		ar.add("UP");
		ar.add("Agra");
		ar.add("Delhi");
		ar.add("maha");
		ar.add("Utrakhand");
		ar.add("Kerela");
		System.out.println("States" + ar);
		
		ar.remove("maha");
		System.out.println("After remove" + ar);
		
		ar.remove(3);
		System.out.println("Again after delete"+ ar);
		
		System.out.println(ar.size());
		
		System.out.println("Extracting using iterator");
		
		Iterator i=ar.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ ", ");
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

}

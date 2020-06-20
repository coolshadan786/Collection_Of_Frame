import java.io.*;
import java.util.*;

public class Array3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int size=Integer.parseInt(br.readLine());
		int ar[]=new int[size];
		
		for(int i=0;i<size;i++) {
				System.out.println("Enter the data");
				ar[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("The in Array");
		display(ar);
		
		System.out.println();
		
		Arrays.sort(ar);
		System.out.println("The sorted Aray");
		display(ar);
		
		System.out.println();
		
		System.out.println("toString");
		Arrays.toString(ar);
		display(ar);
		// TODO Auto-generated method stub

	}
	private static void display(int[] ar) {
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i] + " ");
		// TODO Auto-generated method stub
		}
	}
}

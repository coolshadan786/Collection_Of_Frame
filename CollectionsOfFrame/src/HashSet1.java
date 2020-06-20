import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			HashSet<String> hs=new HashSet<String>();
			hs.add("Umair");
			hs.add("arshad");
			hs.add("Aryan");
			hs.add("Arpit");
			hs.add("Kashif");
			hs.add("Atul");
			
			System.out.println(hs.size());
			
			System.out.println("Data : " + hs);
			
			System.out.println(hs.remove("Aryan"));
				System.out.println("After Rremove data : " + hs);
			
			System.out.println(hs.size());
			
			System.out.println(hs.isEmpty());
			
			// TODO Auto-generated method stub

	}

}

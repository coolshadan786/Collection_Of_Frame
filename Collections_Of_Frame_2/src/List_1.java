import java.util.*;
public class List_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			System.out.println("Enter the size");
			int size=sc.nextInt();
			List ar=new ArrayList<>();
			String s;
			for(int p=0;p<size;p++) {
				System.out.println("Enter the data");
				s=sc.next();
				ar.add(p,s);
			}
			ar.sort(null);
			System.out.println(ar);
			ar.remove(4);
			System.out.println(ar);
		}
	}
}

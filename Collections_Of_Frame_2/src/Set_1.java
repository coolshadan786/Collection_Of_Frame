import java.util.*;
public class Set_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			System.out.println("Enter the size");
			int size=sc.nextInt();
			
			Set s=new HashSet<>();						//for Integer
			int j;
			for(int o=0;o<size;o++) {
				System.out.println("Enter the data");
				j=Integer.parseInt(sc.next());
				s.add(j);
			}
			Iterator it=s.iterator();
			while(it.hasNext()) {
				System.out.print(it.next() + "");
			}
			System.out.println();
			System.out.println("-------------------");
//		-------------------------------------------------------------
			Set s2=new HashSet<>();						//for String 
			System.out.println("Enter the String ");
			String a=sc.next();;
			for(int p=0;p<a.length();p++) {
				s2.add(a.charAt(p));
			}
			int count=0;
			Iterator it1=s2.iterator();
			while(it1.hasNext()) {
				count++;
				System.out.print(it1.next() + "");
			}
			System.out.println();
			System.out.println(count);
		}

	}

}

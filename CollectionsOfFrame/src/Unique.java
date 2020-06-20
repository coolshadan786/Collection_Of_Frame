import java.util.*;

public class Unique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			String str=sc.next();
			int len=str.length();
			HashSet<String> hs=new HashSet<String>();
			hs.add(str);
		
			System.out.println(hs);
		}
	}
}

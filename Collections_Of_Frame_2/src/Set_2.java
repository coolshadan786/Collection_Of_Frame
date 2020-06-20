import java.util.*;
public class Set_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			System.out.println("Enter the size");
			int size=sc.nextInt();
			Set li=new LinkedHashSet<>();
			int i;
			
			for(int n=0;n<size;n++) {
				System.out.println("Enter the data");
				i=Integer.parseInt(sc.next());
				li.add(i);
			}
			
			Iterator it=li.iterator();
			while(it.hasNext()) {
				System.out.print(it.next());
			}
			System.out.println();
			li.remove(3);
			System.out.println(li);
			
			System.out.println(li.size());
			
			System.out.println(li.isEmpty()?"True":"False");
			
			System.out.println(li.toString());
			
			
		}
				

	}

}

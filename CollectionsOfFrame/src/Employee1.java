import java.io.*;

public class Employee1 {
		int id;
		String name;
		
		Employee1(int i, String n){
			id=i;
			name=n;
		}
		void displaydata() {
			System.out.println(id + " " + name);
		}

		public static void main(String[] args) throws Exception {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			Employee1 arr[]=new Employee1[5];
			
			for(int i=0;i<5;i++) {
				System.out.println("Enter id: ");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter Name: ");
				String name=br.readLine();
				
				arr[i]=new Employee1(id,name);
			}
			System.out.println("The Employee data is: ");
			int len=arr.length;
			for(int i=0;i<len;i++) {
				arr[i].displaydata();
			}
		}
}

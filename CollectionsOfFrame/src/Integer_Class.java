import java.io.*;
public class Integer_Class {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int k=0;k<t;k++) {
			String s=br.readLine();
			
			Byte b=new Byte(s);
				System.out.println(b);
			Byte i=new Byte(s);
				System.out.println(i);
			Integer i1=new Integer(202);
				System.out.println(i1);
			int u=Integer.parseInt(br.readLine());
				System.out.println(u);
			Integer s1=new Integer(2020202020);
			String s3=s1.toString();
			System.out.println(s3);
			
			
			int n=b.compareTo(i);
			if(n==0)
				System.out.println("Both are same");
			else if(n<0)
				System.out.println(b + "is less");
			else System.out.println(i + "is less");
		}
	}

}

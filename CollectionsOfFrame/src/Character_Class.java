import java.io.*;
public class Character_Class {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	char ch;
	
	while(true) {
			System.out.println("Enter a sentence");
			ch=(char) br.read();
			
			if(Character.isDigit(ch))
				System.out.println("a digit");
			else if(Character.isLetter(ch))
				System.out.println("a Letter");
			else if(Character.isLetterOrDigit(ch))
				System.out.println(" Letter or A Digit");
			else if(Character.isLowerCase(ch))
				System.out.println("a Lower case");
			else if(Character.isUpperCase(ch))
				System.out.println("a Upper Case");
			else if(Character.isSpaceChar(ch))
				System.out.println("a Spacebar Character");
			else if(Character.isWhitespace(ch))
				System.out.println("a Whitespace Characcter");

	
	}
	}
}

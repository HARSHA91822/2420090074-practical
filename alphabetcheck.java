package hmproject;

import java.util.Scanner;

public class alphabetcheck {
	public static void main(String args[]) {
		Scanner h=new Scanner(System.in);
		char a=h.next().charAt(0);
		
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
			System.out.println("VOWEL"+a);
				
		}
		else {
			System.out.println("CONSONENT "+  a);
		}
		

}
}
import java.util.Scanner;
public class Main {
	
	public static void identifyCharacter(char ch) {
		if (Character.isLowerCase(ch)) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println("Lower-case Ovel");
			}
			else {
				System.out.println("Lower-case Consonent");
			}
		}
		else if(Character.isUpperCase(ch)) {
			if(ch=='A' || ch=='E'  || ch=='E' || ch=='O' || ch=='U') {
				System.out.println("Upper-case Ovel");
			}
			else {
				System.out.println("Upper-case Consonent");
			}
		}
			else if(Character.isDigit(ch)) {
				System.out.println("Digit");
			}	
			else {
				System.out.println("Special Character");
			}
		}
	

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		char ch=s.next().charAt(0);
		identifyCharacter(ch);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);

	}
	public static void findGCD(int a, int b) {
		while(b>1) {
			int rem=a%b;
			a=b;
			b=rem;
			if(b==0 ) {
				System.out.println(a);
			}
		}
		
		
		
	}

}

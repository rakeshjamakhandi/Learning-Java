import java.util.Scanner;

public class PerticulrFibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("START");
		int n=scan.nextInt();
		PerticulrFibonacci PerticulrFibonacci =new PerticulrFibonacci ();
		PerticulrFibonacci.printFibonacciSeries(n);

	}
	 void printFibonacciSeries(int n) {
		
		int num1=0;
		int num2=1;
		if(n==1) {
			System.out.println(num1);
		}
		else if(n==2) {
			System.out.print(num2);
		}
		else {
			for(int i=3;i<=n;i++) {
				int nextnum=num1+num2;
				num1=num2;
				num2=nextnum;
				if(n==i) {
					System.out.print(nextnum);
				}
			}
		}
	}
}
		
	




